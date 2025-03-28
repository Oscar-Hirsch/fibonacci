package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fibonacci_shouldReturn0_WhenInputIs0() {
        int input = 0;
        int expected = 0;
        int actual = Main.fibonacci(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn1_WhenInputIs1() {
        int input = 1;
        int expected = 1;
        int actual = Main.fibonacci(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn2_WhenInputIs2() {
        int input = 2;
        int expected = 1;
        int actual = Main.fibonacci(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn3_WhenInputIs4() {
        int input = 4;
        int expected = 3;
        int actual = Main.fibonacci(input);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn34_WhenInputIs9() {
        int input = 9;
        int expected = 34;
        int actual = Main.fibonacci(input);
        assertEquals(expected, actual);
    }


}