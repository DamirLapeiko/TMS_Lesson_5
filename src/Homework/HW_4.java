package Homework;
import java.util.Random;
//Создайте двумерный массив целых чисел. Выведите на консоль сумму
//всех элементов массива.
public class HW_4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
            array[i][j] = random.nextInt(10);
            sum = sum + array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }
}