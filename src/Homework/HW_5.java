package Homework;
import java.util.Random;
//Создайте двумерный массив. Выведите на консоль диагонали массива.
public class HW_5 {
    public static void main(String[] args) {
        int[][] array = {{3, 0, 1}, {5, 0, 10}, {0, 9, 0}};
        for (int l = 0; l < array.length; l++){
            System.out.print(array[l][l] + " ");
        }
        System.out.println();
        for (int k = 0; k < array.length; k++){
            System.out.print(array[k][array.length - k - 1] + " ");
        }
    }
}
