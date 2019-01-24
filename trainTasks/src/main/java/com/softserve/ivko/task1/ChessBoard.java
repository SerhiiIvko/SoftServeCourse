//package com.softserve.ivko.task1;
//
//public class ChessBoard {
//    private int row_size;
//    private int column_size;
//
//    public static void main(String[] args) {
//        ChessBoard chessBoard = new ChessBoard();
//        try {
//            chessBoard.validate(args);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Incorrect data for executing operation!" + "\n" + e.getMessage());
//        }
//        chessBoard.drawBoard(args);
//    }
//
//    private void drawBoard(String[] args) {
//        row_size = Integer.parseInt(args[0]);
//        column_size = Integer.parseInt(args[1]);
//        ChessBoardDrawer chessBoardDrawer = new ChessBoardDrawerImpl();
//        chessBoardDrawer.drawBoard(row_size, column_size);
//    }
//
//    private boolean validate(String[] args) {
//        if (args.length < 2) {
//            throw new IllegalArgumentException("Quantity of parameters is incorrect");
//        }
//        if (!(isNumber(args[0]) && isNumber(args[1]) && (isPositiveNumber(args[0]) && isPositiveNumber(args[1])))) {
//            throw new IllegalArgumentException("You must enter only positive natural numbers");
//        }
//        return true;
//    }
//
//    private boolean isNumber(String value) {
//        return value.matches("-?\\d+(\\.\\d+)?");
//    }
//
//    private boolean isPositiveNumber(String number) {
//        return Integer.parseInt(number) > 0;
//    }
//}