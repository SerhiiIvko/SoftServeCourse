package com.softserve.ivko;

class ConsoleMessages {
    static final String INPUT_MESSAGE = "Enter parameters of triangle:";
    static final String NAME_MESSAGE = "Enter triangle name:";
    static final String SIDE_A_MESSAGE = "Enter side A:";
    static final String SIDE_B_MESSAGE = "Enter side B:";
    static final String SIDE_C_MESSAGE = "Enter side C:";
    static final String WARNING_WHEN_INPUT_IS_EMPTY = "Input only float point positive numbers!";
    static final String WARNING_WHEN_NEGATIVE_INPUT = "Negative numbers are not allowed!";
    static final String INCORRECT_PARAMETERS = "Incorrect parameters, the shape isn't triangle!";
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