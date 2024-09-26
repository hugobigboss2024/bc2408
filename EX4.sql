CREATE DATABASE Exercise4;
USE Exercise4;

CREATE TABLE PLAYERS(
PLAYER_ID INTEGER NOT NULL UNIQUE,
GROUP_ID INTEGER NOT NULL);

CREATE TABLE MATCHES(
MATCH_ID INTEGER NOT NULL UNIQUE,
FIRST_PLAYER INTEGER NOT NULL,
SECOND_PLAYER INTEGER NOT NULL,
FIRST_SCORE INTEGER NOT NULL,
SECOND_SCORE INTEGER NOT NULL);

INSERT INTO PLAYERS(PLAYER_ID, GROUP_ID) VALUES
(20, 2),(30, 1),(40, 3),(45, 1),(50, 2),(65,1);

INSERT INTO MATCHES(MATCH_ID, FIRST_PLAYER, SECOND_PLAYER, FIRST_SCORE, SECOND_SCORE) VALUES
(1, 30, 45, 10, 12),
(2, 20, 50, 5, 5),
(13, 65, 45, 10, 10),
(5, 30, 65, 3, 15),
(42, 45, 65, 8, 4);

SELECT * FROM PLAYERS;
SELECT * FROM MATCHES;
-- DROP TABLE PLAYERS;
-- DROP TABLE MATCHES;

WITH PlayerScores AS (
    SELECT 
        p.group_id,
        p.player_id,
        SUM(CASE 
                WHEN m.first_player = p.player_id THEN m.first_score
                WHEN m.second_player = p.player_id THEN m.second_score
                ELSE 0
            END) AS total_score
    FROM players p
    LEFT JOIN matches m
        ON p.player_id = m.first_player OR p.player_id = m.second_player
    GROUP BY p.group_id, p.player_id
),
GroupWinners AS (
    SELECT 
        ps.group_id,
        ps.player_id,
        ps.total_score,
        ROW_NUMBER() OVER (PARTITION BY ps.group_id ORDER BY ps.total_score DESC, ps.player_id ASC) AS rank
    FROM PlayerScores ps
)
SELECT group_id, player_id
FROM GroupWinners
WHERE rank = 1
ORDER BY group_id ASC;







