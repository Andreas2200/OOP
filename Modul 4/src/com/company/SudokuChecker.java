package com.company;

public class SudokuChecker {
    public static void main(String[] args)
    {
        int[][] sudokuBoard ={
                {1,2,3,4,5,6,7,8,9},
                {2,3,4,5,6,7,8,9,9},
                {3,4,5,6,7,8,9,1,9},
                {4,5,6,7,8,9,1,2,9},
                {5,6,7,8,9,1,2,3,9},
                {6,7,8,9,1,8,3,4,9},
                {7,8,9,1,2,3,4,7,9},
                {8,9,1,2,3,4,5,6,9},
                {9,1,2,3,4,5,6,7,9}
        };
        boolean isValidSudoku;
        int sudokuTotal = 45;
        int total;

        for (int i = 0; i < sudokuBoard.length; i++) {
            System.out.println(" ");
            total = 0;
            for (int j = 0; j < sudokuBoard[i].length; j++) {
                System.out.print(sudokuBoard[i][j] + " ");
                total += sudokuBoard[i][j];
                if(total == sudokuTotal)
                {
                    isValidSudoku = true;
                    System.out.println(isValidSudoku);
                }
                else if (total != sudokuTotal && j == sudokuBoard[i].length - 1)
                {
                    isValidSudoku = false;
                    System.out.println(isValidSudoku);
                }
            }
        }
        for (int k = 0; k < sudokuBoard.length; k++) {
            System.out.println(" ");
            total = 0;
            for (int l = 0; l < sudokuBoard.length; l++) {
                System.out.println(sudokuBoard[l][k]);
                total += sudokuBoard[l][k];
                if(total == sudokuTotal && l == sudokuBoard.length - 1)
                {
                    isValidSudoku = true;
                    System.out.println(isValidSudoku);
                }
                else if(total != sudokuTotal && l == sudokuBoard.length - 1)
                {
                    isValidSudoku = false;
                    System.out.println(isValidSudoku);
                }
            }
        }
    }
}
