package com.softserve.ivko.task1;

/**
 * 1. Шахматная доска
 * Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
 *                 * * * * * *
 *                  * * * * * *
 *                 * * * * * *
 *                  * * * * * *
 * Программа запускается через вызов главного класса с параметрами.
 */

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        try {
            if (application.isArgsValid(args)){
                application.getChessBoard(args);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect data for executing operation!" + "\n" + e.getMessage());
        }

    }

    private void getChessBoard(String[] args) {
        int rowSize = Integer.parseInt(args[0]);
        int columnSize = Integer.parseInt(args[1]);
        ChessBoardDrawer chessBoardDrawer = new ChessBoardDrawerImpl();
        chessBoardDrawer.drawBoard(rowSize, columnSize);
    }

    private boolean isArgsValid(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Quantity of parameters is incorrect");
        }
        if (!(isNumber(args[0]) && isNumber(args[1]) && (isPositiveNumber(args[0]) && isPositiveNumber(args[1])))) {
            throw new IllegalArgumentException("You must enter only positive natural numbers");
        }
        return true;
    }

    private boolean isNumber(String value) {
        return value.matches("^\\d+$");
    }

    private boolean isPositiveNumber(String number) {
        return Integer.parseInt(number) > 0;
    }
}