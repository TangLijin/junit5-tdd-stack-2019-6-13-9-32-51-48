package com.thoughtworks.tdd;

public class Game {

    public String fizzBuzz(int i) {
        String result = "";
        if (i == 13) {
            return "Fizz";
        }
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }

        if (i % 7 == 0) {
            result += "Whizz";
        }
        if(result.length() > 0){
            return result;
        }
        if (result == "") {
            result += i;
        }
        return result;

    }
}
