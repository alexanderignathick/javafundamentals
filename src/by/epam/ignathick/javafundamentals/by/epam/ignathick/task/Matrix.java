package by.epam.ignathick.javafundamentals.by.epam.ignathick.task;

import java.util.Random;

public class Matrix {
    int interval = 10;
    int dimmension = 5;
    int[][] matrix = new int[dimmension][dimmension];

    public Matrix() {
        putValuesIntoTheMatix();
        calculateSumm();
    }

    public Matrix(int interval, int dimmension) {
        this.interval = interval;
        this.dimmension = dimmension;

        putValuesIntoTheMatix();
        calculateSumm();

    }

    private void putValuesIntoTheMatix() {

        int min = -interval;
        int max = interval;

        for (int i = 0; i < dimmension; i++) {
            for (int j = 0; j < dimmension; j++) {
                matrix[i][j] = new Random().nextInt((max - min) + 1) + min;
            }
        }

        System.out.println(printMatrix());
    }

    private void calculateSumm(){
        int sum = 0;
        for (int i = 0; i < dimmension; i++) {
            int firstPositiveValueInRow = 0;
            int lastPositiveValueInRow = 0;
            for (int j = 0; j < dimmension; j++) {
                int curentMatrixValue = matrix[i][j];
                if (curentMatrixValue > 0) {
                    if(firstPositiveValueInRow == 0) {
                        firstPositiveValueInRow = curentMatrixValue;
                    } else if (lastPositiveValueInRow == 0) {
                        lastPositiveValueInRow = curentMatrixValue;
                    }
                } else if (firstPositiveValueInRow > 0 && lastPositiveValueInRow == 0) {
                    sum += curentMatrixValue;
                }
            }
        }
        System.out.println("Summ between first and last positive values in all rows of matrix is: " + sum);
    }

    public String printMatrix() {
        String matrixOut = "";
        for (int i = 0; i < dimmension; i++) {
            for (int j = 0; j < dimmension; j++) {
                matrixOut += matrix[i][j];
                matrixOut += "\t";
            }
            matrixOut = matrixOut + "\n";
        }
        return  matrixOut;
    }

}
