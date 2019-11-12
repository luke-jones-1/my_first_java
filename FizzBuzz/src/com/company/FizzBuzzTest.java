package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void isMultipleOfThree() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.isMultipleOfThree(3));
        assertFalse(fizzbuzz.isMultipleOfThree(4));
    }

    @Test
    void isMultipleOfFive() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.isMultipleOfFive(5));
        assertFalse(fizzbuzz.isMultipleOfFive(4));
    }

    @Test
    void converter() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.converter(3));
        assertEquals("Buzz", fizzbuzz.converter(5));
        assertEquals("FizzBuzz", fizzbuzz.converter(15));
        assertEquals("1", fizzbuzz.converter(1));
        assertEquals("11", fizzbuzz.converter(11));
    }

    @Test
    void upto() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String[] actual = fizzbuzz.upto(100);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fizzbuzz.upto(5));
        assertEquals("FizzBuzz", actual[14]);
        assertEquals("FizzBuzz", actual[74]);
        assertEquals("62", actual[61]);
        assertEquals("Buzz", actual[99]);
    }
}