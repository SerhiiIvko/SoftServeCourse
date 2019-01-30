package com.softserve.ivko;

/**
 * Число в пропись
 * Нужно преобразовать целое число в прописной вариант: 12 – двенадцать. Программа запускается через вызов главного
 * класса с параметрами.
 */

public class MainApplication {
    public static void main(String[] args) {
        NumberToWordConverter numberToWordConverter = new NumberToWordConverter();
        if (ArgumentsValidator.isArgsValid(args)) {
            System.out.println(numberToWordConverter.convertNumberToWord(args));
        }
    }
}