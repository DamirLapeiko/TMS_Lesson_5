package Homework;
import java.util.Random;
//Создайте двумерный массив. Выведите на консоль диагонали массива.
public class HW_5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(15);
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                } else if (i + j == array.length - 1) {
                    System.out.print(array[i][j] + " ");
                } else {
                    array[i][j] = 0;
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
