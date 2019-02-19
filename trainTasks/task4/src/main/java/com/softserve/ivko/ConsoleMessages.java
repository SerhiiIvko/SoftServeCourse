package com.softserve.ivko;

class ConsoleMessages {
    static String STRING_MESSAGE = "Строка \"";
    static String FOUND_MESSAGE = "\" встречается в тексте ";
    static String COUNT_MESSAGE1 = " раз";
    static String BRAKE_MESSAGE1 = "\" ";
    static String COUNT_MESSAGE2 = " раз";
    static String REPLACED_MESSAGE = "\" заменена на \"";

    static void printMessage(String message) {
        System.out.println(message);
    }
}