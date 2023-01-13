public class Practic {
    public static void main(String[] args) {
        int[][][] threeRowArray = new int[3][][];
        threeRowArray[0] = new int[5][5];
        threeRowArray[1] = new int[4][4];
        threeRowArray[2] = new int[3][3];
        for (int i = 0; i < threeRowArray.length; i++) {
            for (int j = 0; j < threeRowArray[i].length; j++) {
                for (int k = 0; k < threeRowArray[i][j].length; k++) {
                    threeRowArray[i][j][k] = k + 1;
                    System.out.print(threeRowArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
