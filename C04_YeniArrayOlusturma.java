package day22_OdevMultiDimensionalArrays;

import java.util.Arrays;

public class C04_YeniArrayOlusturma {
    public static void main(String[] args) {
        //asagidaki multi-dimensional array'in ic arraylerindeki tum elemanlarin toplamini birer birer bulan
        //ve her bir sonucu yeni bir arrayin elemani yapan ve yeni arrayin ekrana yazdiran bir prog.yazin
        //{{1,2,3},{4,5},{6,7}}
        //Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3  4+5  6+7 ==> output : {6,9,13}
        int [][] array={{1,2,3},{4,5},{6,7}};
        int toplam=0;
        int [] yeniArray=new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                toplam+=array[i][j];
            }
           
            yeniArray[i]= toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
