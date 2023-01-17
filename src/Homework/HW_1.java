package Homework;
import java.util.Random;
import java.util.Scanner;
//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
//Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
public class HW_1 {
    public static void main(String[] args) {
        int[][][] array = new int[3][][];
        array[0] = new int[5][5];
        array[1] = new int[4][4];
        array[2] = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Введите число, на которое хотите увеличить каждый элемент");
        Scanner sc = new Scanner(System.in);
        int addNumber = sc.nextInt();
        for (int n = 0; n < array.length; n++) {
            for (int j = 0; j < array[n].length; j++) {
                for (int b = 0; b < array[n][j].length; b++) {
                    array[n][j][b] += addNumber;
                    System.out.print(array[n][j][b] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}