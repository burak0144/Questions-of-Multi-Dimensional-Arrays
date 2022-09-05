package day22_OdevMultiDimensionalArrays;

public class C02_SonElemanlarinCarpimi {
    public static void main(String[] args) {
        //son elemanlarin carpimini yazdirin
        int [][] sayilar={{1,2,3},{4,5},{6}};
        int sonElemanlarinCarpimi=1;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length; j++) {
                if (j == sayilar[i].length-1) {
                   sonElemanlarinCarpimi*=sayilar[i][j];
                }

            }

        }
        System.out.println("Son Elemanlarin Carpimi = " + sonElemanlarinCarpimi);
    }
}
