package com.softserve.ivko;

public class ArgsValidator {
//    public boolean validate(String[] args){
//
//
////        return isArgsValid(args)
//    }

//    private boolean isArgsValid(String[] args) {
//        if (args.length < 2) {
//            throw new IllegalArgumentException("Quantity of parameters is incorrect");
//        }
//        if (!(isNumber(args[0]) && isNumber(args[1]) && (isPositiveNumber(args[0]) && isPositiveNumber(args[1])))) {
//            throw new IllegalArgumentException("You must enter only positive natural numbers");
//        }
//        return true;
//    }

    private boolean isNumber(String value) {
        return value.matches("^\\d+$");
    }

    private boolean isPositiveNumber(String number) {
        return Integer.parseInt(number) > 0;
    }
}