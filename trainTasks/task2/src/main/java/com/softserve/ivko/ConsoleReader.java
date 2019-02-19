package com.softserve.ivko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConsoleReader {
    final ConvertComparator comparator = new ConvertComparator();

    List<Convert> getConvertsFromConsole() {
        List<Convert> converts = new ArrayList<>();
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            double convert1width;
            double convert2width;
            double convert1height;
            double convert2height;
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_MESSAGE);
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_WIDTH_CONVERT1);
            convert1width = Double.parseDouble(scanner.nextLine());
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_HEIGHT_CONVERT1);
            convert1height = Double.parseDouble(scanner.nextLine());
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_WIDTH_CONVERT2);
            convert2width = Double.parseDouble(scanner.nextLine());
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_HEIGHT_CONVERT2);
            convert2height = Double.parseDouble(scanner.nextLine());
            if (!ConvertValidator.validate(convert1width, convert1height)
                    || !ConvertValidator.validate(convert2width, convert2height)) {
                throw new IllegalArgumentException(ConsoleMessages.INCORRECT_PARAMETERS);
            } else {
                Convert convert1 = new Convert(convert1width, convert1height);
                Convert convert2 = new Convert(convert2width, convert2height);
                converts.add(convert1);
                converts.add(convert2);
                input = getStringFromConsole(scanner);
            }
        } while (!getBreakLoopCondition(input));
        scanner.close();
        return converts;
    }

    private static String getStringFromConsole(Scanner scanner) {
        String string = "";
        ConsoleMessages.printMessage(ConsoleMessages.CONTINUE_MESSAGE);
        while (string.equalsIgnoreCase("")) {
            if (!scanner.hasNext()) {
                ConsoleMessages.printMessage(ConsoleMessages.WARN_MESSAGE);
                scanner.nextLine();
            } else {
                string = scanner.nextLine();
            }
            if (!string.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_NO_1)
                    && !string.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_NO_2)
                    && !string.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_YES_1)
                    && !string.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_YES_2)) {
                string = "";
                ConsoleMessages.printMessage(ConsoleMessages.WARN_MESSAGE);
            }
        }
        return string.toLowerCase().trim();
    }

    private static boolean getBreakLoopCondition(String input) {
        boolean exitCondition = false;
        input = input.trim();
        if (input.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_YES_1)
                || input.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_YES_2)) {
            return false;
        } else if (input.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_NO_1)
                || input.equalsIgnoreCase(ConsoleMessages.USER_ANSWER_NO_2)) {
            exitCondition = true;
        }
        return exitCondition;
    }
}