package org.author.demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void guessCounterMatchesTheNumberOfGuesses() {
        final ColorQuiz quiz = new ColorQuiz();

        final int repNumber = 10;
        int numberOfGuesses = 0;

        for (ColorQuiz.Color color : ColorQuiz.Color.values()) {
            for (int i = 0; i < repNumber; ++i) {
                if (quiz.guessTheColor(color)) {
                    ++numberOfGuesses;
                }
            }

            final int expected = numberOfGuesses;
            final int actual = quiz.getGuessCounter();

            Assert.assertEquals(expected, actual);

            numberOfGuesses = 0;
            quiz.reset();
        }
    }
}
