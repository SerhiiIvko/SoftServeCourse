//package com.softserve.ivko;
//
///**
// * Число в пропись
// * Нужно преобразовать целое число в прописной вариант: 12 – двенадцать. Программа запускается через вызов главного
// * класса с параметрами.
// */
//
//public class MainApplication {
//    public static void main(String[] args) {
//        NumberToWord numberToWord = new NumberToWord();
//        if (isArgsValid(args)) {
//            System.out.println(numberToWord.convert(args));
//        }
//    }
//
//    private static boolean isArgsValid(String[] args) {
//        if (args.length < 1) {
//            throw new IllegalArgumentException("Quantity of parameters is incorrect");
//        }
//        if (!(isNumber(args[0]))) {
//            throw new IllegalArgumentException("You must enter only natural numbers");
//        }
//        return true;
//    }
//
//    private static boolean isNumber(String value) {
//        return value.matches("^-?\\d+");
//    }
//}