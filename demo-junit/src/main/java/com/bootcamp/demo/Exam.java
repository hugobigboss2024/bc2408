package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;

// Background: Exam object is with dependency of Calculator object
// !!! How to test lowestScore and findMin() ????
public class Exam {
    // private List<Integer> scores;
    private final Calculator calculator;

    public Exam() {
        // this.scores = new LinkedList<>();
        this.calculator = new Calculator(new LinkedList<>());
    }

    // Dependeny Injection
    public Exam(Calculator calculator) {
        // this.scores = Arrays.stream(calculator.getScores()) //
        // .boxed().collect(Collectors.toList());
        this.calculator = calculator;
    }

    public Exam(List<Integer> scores) {
        // this.scores = Arrays.stream(scores).boxed().collect(Collectors.toList());
        this.calculator = new Calculator(scores);
    }

    public void addScore(Integer score) {
        this.calculator.getScores().add(score);
    }

    // !!!! Exam Object -> instance method (lowestScore())
    // !!!! call -> Calculator object instance method
    public int lowestScore() {
        // List<Integer> -> Integer[]
        // Integer[] arr = this.scores.toArray(new Integer[this.scores.size()]);
        // List<Integer> -> IntStream -> int[]
        // int[] arr = this.scores.stream().mapToInt(i -> i.intValue()).toArray();
        return this.calculator.findMin() - 10; // value add for lowestScore()
    }

    public static void main(String[] args) {
        Exam maths = new Exam();
        maths.addScore(70);
        maths.addScore(90);
        maths.addScore(65);
        System.out.println(maths.lowestScore()); // 65 - 10 -> 55
    }
}
