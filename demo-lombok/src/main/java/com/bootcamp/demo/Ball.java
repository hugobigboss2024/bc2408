package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data // Includes Getters, Setters, toString(), equals(), hashCode()
@AllArgsConstructor
@Builder
public class Ball {
    private Color color;

    public static enum Color {
        RED, BLUE, BLACK
    }

    public static void main(String[] args) {
        Ball ball = new Ball(Color.RED);
        ball.setColor(Color.BLACK);
        System.out.println(ball.getColor()); // "BLACK"

        Ball ball2 = Ball.builder() //
                .color(Color.BLACK) //
                .build();
        System.out.println(ball2); // toString() -> Ball(color=BLACK)
    }
}