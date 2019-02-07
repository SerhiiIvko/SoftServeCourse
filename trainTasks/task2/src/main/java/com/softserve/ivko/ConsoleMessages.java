package com.softserve.ivko;

class ConsoleMessages {
    static final String INPUT_MESSAGE = "Enter parameters of triangle in format (delimiter - comma):\n" +
            "<name>, <side length>, <side length>, <side length>:";
    static final String WARN_MESSAGE = "Enter Yes or No";
    static final String INCORRECT_PARAMETERS = "Incorrect parameters! Try input again!";
    static final String CONTINUE_MESSAGE = "Enter else? Y/N";
    static final String USER_ANSWER_YES_1 = "Y";
    static final String USER_ANSWER_YES_2 = "Yes";
    static final String USER_ANSWER_NO_1 = "N";
    static final String USER_ANSWER_NO_2 = "No";
    static final String OUTPUT_LIST_PATTERN_MESSAGE = "============= Triangles list: ===============";

    static void printMessage(String message) {
        System.out.println(message);
    }
}