package com.softserve.ivko.task1;

import com.softserve.ivko.task1.CellsContainer;
import com.softserve.ivko.task1.ChessBoardDrawer;

public class ChessBoardDrawerImpl implements ChessBoardDrawer {

    public void drawBoard(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String output;
                if (((i + j) & 1) == 0) {
                    output = CellsContainer.EVEN_CELL_PATTERN;
                } else {
                    output = CellsContainer.ODD_CELL_PATTERN;
                }
                System.out.print(output);
            }
            System.out.println();
        }
    }
}