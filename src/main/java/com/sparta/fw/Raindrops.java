package com.sparta.fw;


public class Raindrops {
    public static String factorOutputs(int inputNumber) {
        StringBuilder output = new StringBuilder();

        if (inputNumber <= 0) {
            return String.valueOf(inputNumber);
        }
        if (inputNumber % 3 == 0) {
            output.append("Pling");
        }
        if (inputNumber % 5 == 0) {
            output.append("Plang");
        }
        if (inputNumber % 7 == 0) {
            output.append("Plong");
        }
        if (output.isEmpty()){
            return Integer.toString(inputNumber);
        } else {
        }
        return output.toString();
    }
}

