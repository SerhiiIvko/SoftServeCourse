package com.softserve.ivko;

class ConsoleMessages {
    static final String INPUT_MESSAGE = "Enter parameters of two converts:";
    static final String WARN_MESSAGE = "Enter Yes or No";
    static final String INCORRECT_PARAMETERS = "Incorrect parameters! Try input again!";
    static final String CONTINUE_MESSAGE = "Enter else? Y/N";
    static final String USER_ANSWER_YES_1 = "Y";
    static final String USER_ANSWER_YES_2 = "Yes";
    static final String USER_ANSWER_NO_1 = "N";
    static final String USER_ANSWER_NO_2 = "No";



    static final String INPUT_WIDTH_CONVERT1 = "Input width of first convert";
    static final String INPUT_HEIGHT_CONVERT1 = "Input height of first convert";
    static final String INPUT_WIDTH_CONVERT2 = "Input width of second convert";
    static final String INPUT_HEIGHT_CONVERT2 = "Input height of second convert";

    static void printMessage(String message) {
        System.out.println(message);
    }
}