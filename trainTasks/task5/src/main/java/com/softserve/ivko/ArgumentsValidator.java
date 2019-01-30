package com.softserve.ivko;

class ArgumentsValidator {

    static boolean isArgsValid(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Quantity of parameters is incorrect");
        }
        if (!(isNumber(args[0]))) {
            throw new IllegalArgumentException("You must enter only natural numbers");
        }
        return true;
    }

    private static boolean isNumber(String value) {
        return value.matches("^-?\\d+");
    }
}