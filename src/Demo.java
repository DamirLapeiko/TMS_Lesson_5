import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[][] twoRowArray = new int[3][];
        //Зубчатый массив
        twoRowArray[0] = new int[4];
        twoRowArray[1] = new int[2];
        twoRowArray[2] = new int[3];
//        for (int[] inner : twoRowArray){
//            Arrays.fill(inner, (int)(Math.random() * 5));  //fill заполняет все ячейки одинаковым числом
//                                                           //чтобы не одинаковым, нужно через цикл
//        }
//        for (int i = 0; i < twoRowArray.length; i++) {
//            for (int j = 0; j < twoRowArray[i].length; j++) {
//                twoRowArray[i][j] = (int) (Math.random() * 50);
//            }
//    }
        Random random = new Random(); //если рандомом заполнить числа, то лучше вот таким способом
        for (int i = 0; i < twoRowArray.length; i++) {
            for (int j = 0; j < twoRowArray[i].length; j++) {
                twoRowArray[i][j] = random.nextInt();
            }
        }
            for (int i = 0; i < twoRowArray.length; i++) {
                for (int j = 0; j < twoRowArray[i].length; j++) {
                    System.out.print(twoRowArray[i][j] + " ");
                }
                System.out.println();
            }
//        System.out.println(twoRowArray);
//        System.out.println(Arrays.toString(twoRowArray)); //работает в основном с одномерными массивами
//        System.out.println(Arrays.deepToString(twoRowArray)); //работает с двумерными и больше массивами
        }
    }