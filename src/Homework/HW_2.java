package Homework;

//Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'ов 8х8. С помощью циклов задать
//элементам циклам значения B(Black) или W(White).
public class HW_2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = "W";
                    if (j % 2 != 0) {
                        array[i][j] = "B";
                    }
                } if (i % 2 != 0) {
                    array[i][j] = "W";
                    if (j % 2 == 0) {
                        array[i][j] = "B";
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
