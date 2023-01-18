package Homework;

import java.util.Arrays;

//Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы).
//Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//Ожидаемый результат: 1 2 3 1 1 1 0 0 0
public class HW_3 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int m = arr1.length;
        int n = arr2[0].length;
        int o = arr2.length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
