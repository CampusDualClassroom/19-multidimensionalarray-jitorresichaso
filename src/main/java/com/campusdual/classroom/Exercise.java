package com.campusdual.classroom;

public class Exercise {

    public static int[] createAndPopulateUnidimensionalArray(int columns) {
        int[] array = new int[columns];
        for (int i = 0; i < columns; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value++;
            }
        }
        return array;
    }

    public static int[][][] createAndPopulateTridimensionalArray(int depth, int rows, int columns) {
        int[][][] array = new int[depth][rows][columns];
        int value = 1;
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    array[i][j][k] = value++;
                }
            }
        }
        return array;
    }

    public static String getUnidimensionalString(int[] uniArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uniArray.length; i++) {
            sb.append(uniArray[i]);
            if (i < uniArray.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String getBidimensionalString(int[][] intArrayBi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArrayBi.length; i++) {
            sb.append(getUnidimensionalString(intArrayBi[i]));
            if (i < intArrayBi.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
        int rows = intArrayTri[0].length;
        int cols = intArrayTri[0][0].length;
        int[][] flat = new int[rows][cols];
        for (int i = 0; i < intArrayTri.length; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    flat[j][k] += intArrayTri[i][j][k];
                }
            }
        }
        return flat;
    }

    public static void main(String[] args) {
        int[] uniArray = createAndPopulateUnidimensionalArray(5);
        System.out.println(getUnidimensionalString(uniArray));
        System.out.println("===================");
        int[][] intArrayBi = createAndPopulateBidimensionalArray(3, 3);
        System.out.println(getBidimensionalString(intArrayBi));
        System.out.println("===================");
        int[][][] intArrayTri = createAndPopulateTridimensionalArray(3, 3, 3);
        int[][] flatMatrix = flatTridimensionalArray(intArrayTri);
        System.out.println(getBidimensionalString(flatMatrix));
    }
}
