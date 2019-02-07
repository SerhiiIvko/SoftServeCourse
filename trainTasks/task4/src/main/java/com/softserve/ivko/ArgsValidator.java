package com.softserve.ivko;

class ArgsValidator {

    static boolean isArgsValid(String[] args) {
        if (args.length < 2 | args.length > 3) {
            throw new IllegalArgumentException("Quantity of parameters is incorrect");
        }
        return true;
    }
}