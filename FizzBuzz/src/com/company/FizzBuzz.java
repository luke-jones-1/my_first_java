package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
//        it is necessary to either create an instance of the fizzbuzz class or make all methods within the
//        class static in order to call methods inside the main. i chose to create an instance as i assume
//        using statics would make my turn this class into more of a module than a class, as i import it into
//        my main.java class(which i am aware is unecessary i just wanted to experiment with it). i imagine
//        that with larger programs this would lead to overly complicated method names and conflicts between
//        methods with similar names in different classes if not managed properly.
        FizzBuzz fizzbuzz = new FizzBuzz();
        String[] output = fizzbuzz.upto(100);
        for (String s : output) {
            System.out.println(s);
        }
    }

    public boolean isMultipleOfThree(int i){
        return (i % 3) == 0;
    }

    public boolean isMultipleOfFive(int i) {
        return (i % 5) == 0;
    }

    public String converter(int i) {
        if(isMultipleOfThree(i) && isMultipleOfFive(i)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(i)){
            return "Fizz";
        } else if (isMultipleOfFive(i)) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    public String[] upto(int a) {
        String[] converted = new String[a];
        for (int i = 0; i < a; i++) {
             converted[i] = (converter(i+1));
        }
        return converted;
    }
}
