package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maxRows;
        int maxCols;
        int minRows = 0;
        int minCols = 0;
        int iDimension;

        Scanner input = new Scanner(System.in);

        System.out.println("Dimension eingeben: ");
        iDimension = input.nextInt();

        int[][] name = new int[iDimension][iDimension];
        maxRows = iDimension-1;
        maxCols = iDimension-1;

        for (int i = 0; i < (iDimension * iDimension); ) {

            for (int j = minRows; j <= maxCols; j++)
                name[minRows][j] = ++i;

            minRows++;

            for (int k = minRows; k <= maxRows; k++)
                name[k][maxCols] = ++i;

            maxCols--;

            for ( int z = maxCols; z >= minCols; z--)
                name[maxRows][z] = ++i;

            maxRows--;

            for (int m = maxRows; m >= minRows; m--)
                name[m][minCols] = ++i;

            minCols++;
        }

        for (int n = 0; n <= iDimension-1; n++) {
            for (int o = 0; o <= iDimension-1; o++) {
                System.out.printf("%3d ", name[n][o]);
            }
            System.out.println();
        }
    }
}