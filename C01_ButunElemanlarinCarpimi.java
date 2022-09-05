package day22_OdevMultiDimensionalArrays;

public class C01_ButunElemanlarinCarpimi {
    public static void main(String[] args) {
        //tum elemanlarin carpimini yazdirin
        int [][] sayilar={{1,2,3},{4,5,6}};
         int carpim=1;
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                carpim*= sayilar[i][j];
            }

        }
        System.out.println("sayilarin carpimi = " + carpim);
    }
}
