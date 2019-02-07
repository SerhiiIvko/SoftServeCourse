package com.softserve.ivko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    List<Convert> getConvertFromConsole() {
        List<Convert> triangles = new ArrayList<>();
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            String name;
            double sideA;
            double sideB;
            double sideC;
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_MESSAGE);
            String[] params = parseParamsFromUserInput(scanner);
            if (params.length != 4) {
                throw new IllegalArgumentException(ConsoleMessages.INCORRECT_PARAMETERS);
            } else {
                name = params[0];
                sideA = Double.parseDouble(params[1]);
                sideB = Double.parseDouble(params[2]);
                sideC = Double.parseDouble(params[3]);
            }
            if (!TriangleValidator.isShapeTriangle(sideA, sideB, sideC)) {
                throw new IllegalArgumentException(ConsoleMessages.INCORRECT_PARAMETERS);
            } else {
                Triangle triangle = new Triangle(name, sideA, sideB, sideC);
                triangles.add(triangle);
                input = getStringFromConsole(scanner);
            }
        } while (!getBreakLoopCondition(input));
        scanner.close();
        return triangles;
    }

    private static String[] parseParamsFromUserInput(Scanner scanner) {
        String userInput = scanner.nextLine();
        return userInput.replace(" ", "").trim().split(",");
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