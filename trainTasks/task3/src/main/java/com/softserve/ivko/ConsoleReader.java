package com.softserve.ivko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {
    private Scanner scanner;

    public List<Triangle> getTriangleFromConsole() {
        List<Triangle> triangles = new ArrayList<>();
        String input;
        scanner = new Scanner(System.in);
        do {
            String name;
            double sideA;
            double sideB;
            double sideC;
            ConsoleMessages.printMessage(ConsoleMessages.INPUT_MESSAGE);
            name = getStringFromConsole(scanner, ConsoleMessages.NAME_MESSAGE);
            sideA = getNumberFromConsole(scanner, ConsoleMessages.SIDE_A_MESSAGE);
            sideB = getNumberFromConsole(scanner, ConsoleMessages.SIDE_B_MESSAGE);
            sideC = getNumberFromConsole(scanner, ConsoleMessages.SIDE_C_MESSAGE);
            if (!TriangleValidator.isShapeTriangle(sideA, sideB, sideC)) {
                throw new IllegalArgumentException(ConsoleMessages.INCORRECT_PARAMETERS);
            } else {
                Triangle triangle = new Triangle(name, sideA, sideB, sideC);
                triangles.add(triangle);
                input = getStringFromConsole(scanner, ConsoleMessages.CONTINUE_MESSAGE);
            }
        } while (!getBreakLoopCondition(input));
        scanner.close();
        return triangles;
    }

    private static double getNumberFromConsole(Scanner scanner, String inviteText) {
        double number = -1;
        ConsoleMessages.printMessage(inviteText);
        while (number < 0) {
            if (!scanner.hasNextDouble()) {
                ConsoleMessages.printMessage(ConsoleMessages.WARNING_WHEN_INPUT_IS_EMPTY);
                scanner.next();
            } else {
                number = scanner.nextDouble();
                if (number <= 0) {
                    ConsoleMessages.printMessage(ConsoleMessages.WARNING_WHEN_NEGATIVE_INPUT);
                }
            }
        }
        return number;
    }

    private static String getStringFromConsole(Scanner scanner, String inviteText) {
        String string = "";
        ConsoleMessages.printMessage(inviteText);
        while (string.equalsIgnoreCase("")) {
            if (!scanner.hasNext()) {
                ConsoleMessages.printMessage(ConsoleMessages.NAME_MESSAGE);
                scanner.next();
            } else {
                string = scanner.next();
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