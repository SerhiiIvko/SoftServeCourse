//package com.softserve.ivko;
//
//class NumberToWord {
//
//    private String convertLessThanOneThousand(long number) {
//        String current;
//        if (number % 100 < 20) {
//            current = DigitsNameContainer.DELIMITER + DigitsNameContainer.DIGITS_NAMES[(int) number % 100];
//            number /= 100;
//        } else {
//            current = DigitsNameContainer.DELIMITER + DigitsNameContainer.DIGITS_NAMES[(int) number % 10];
//            number /= 10;
//            current = DigitsNameContainer.DELIMITER
//                    + DigitsNameContainer.TENS_NAMES[(int) number % 10]
//                    + current;
//            number /= 10;
//        }
//        if (number == 0) {
//            return current;
//        }
//        return DigitsNameContainer.DIGITS_NAMES[(int) number]
//                + DigitsNameContainer.DELIMITER
//                + DigitsNameContainer.HUNDRED
//                + current;
//    }
//
//    String convert(String[] args) {
//        long number = Long.parseLong(args[0]);
//        if (number == 0) {
//            return DigitsNameContainer.ZERO;
//        }
//        String prefix = "";
//        if (number < 0) {
//            number = -number;
//            prefix = DigitsNameContainer.NEGATIVE;
//        }
//        StringBuilder current = new StringBuilder();
//        long place = 0;//long
//        do {
//            long n = number % 1000;
//            if (n != 0) {
//                String s = convertLessThanOneThousand(n);
//                current.insert(0, s
//                        + DigitsNameContainer.DELIMITER
//                        + DigitsNameContainer.SPECIAL_NAMES[(int) place]
//                        + DigitsNameContainer.DELIMITER);
//            }
//            place++;
//            number /= 1000;
//        } while (number > 0);
//        return (prefix
//                + DigitsNameContainer.DELIMITER
//                + current).trim();
//    }
//}