package me.cordones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTests {

    @ParameterizedTest(name = "FizzBuzz of {0} is {1}")
    @MethodSource("fizzBuzzArguments")
    void testFizzBuzz(int n, String result) {
        FizzBuzz fb = new FizzBuzz();
        assertEquals(fb.of(n), result);
    }

    private static List<Arguments> fizzBuzzArguments() {
        return Arrays.asList(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(4, "4"),
                Arguments.of(5, "Buzz"),
                Arguments.of(6, "Fizz"),
                Arguments.of(7, "7"),
                Arguments.of(8, "8"),
                Arguments.of(9, "Fizz"),
                Arguments.of(10, "Buzz"),
                Arguments.of(11, "11"),
                Arguments.of(12, "Fizz"),
                Arguments.of(13, "13"),
                Arguments.of(14, "14"),
                Arguments.of(15, "Fizz Buzz"),
                Arguments.of(16, "16")
        );
    }
}
