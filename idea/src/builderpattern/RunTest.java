package builderpattern;

public class RunTest {

    public static void main(String[] args) {
        User user = new User.UserBuilder("tom")// final name so need add name for new user,if not cant new user
                .age(24)// age is not final, so can add or not add,if not add also cant new user
                .build();// biilder pattern class to new object need to .build(); for end,no need at thie
                         // new object + ;
        DatabaseConnection dbConnection = new DatabaseConnection.DBConnectionBuilder("jdbc:postgresql://localhost/mydb")// ur1?
                .name("cool")
                .password("qwert")
                .port(0001)// if i .port(0002) can i new user? //no???
                .build();
    }
}
