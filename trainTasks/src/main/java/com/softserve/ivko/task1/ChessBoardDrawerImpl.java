//package com.softserve.ivko.task1;
//
//public class ChessBoardDrawerImpl implements ChessBoardDrawer {
//    private CellsContainer container;
//
//    public void drawBoard(int rows, int columns) {
//        container = new CellsContainer();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                String output = (((i + j) & 1) == 0) ? container.getEVEN_CELL_PATTERN() : container.getODD_CELL_PATTERN();
//                System.out.print(output);
//            }
//            System.out.println();
//        }
//    }
//}