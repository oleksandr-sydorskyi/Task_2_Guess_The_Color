package org.author.demo;

public class App {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please specify a color as a command-line argument (RED, GREEN, or BLUE).");
            return;
        }

        String inputColor = args[0].toUpperCase();

        try {
            ColorQuiz.Color guessedColor = ColorQuiz.Color.valueOf(inputColor);
            ColorQuiz quiz = new ColorQuiz();

            boolean result = quiz.guessTheColor(guessedColor);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color specified. Please use RED, GREEN, or BLUE.");
        }
    }
}

