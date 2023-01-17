package Homework;
import java.util.Arrays;
import java.util.Random;
//Создайте двумерный массив целых чисел.
//Отсортируйте элементы в строках двумерного массива по возрастанию.
public class HW_6 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(15);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < array.length; l++) {
                Arrays.sort(array[l]);
            }
        }
        System.out.print("Массив по возрастанию: " + Arrays.deepToString(array));
    }
}
