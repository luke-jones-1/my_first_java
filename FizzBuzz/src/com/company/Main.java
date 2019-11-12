package com.company;

import com.company.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String[] output = fizzbuzz.upto(100);
        for (String s : output) {
            System.out.println(s);
        }
    }
}
