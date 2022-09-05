package day22_OdevMultiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_ArraySilme {
    public static void main(String[] args) {

        //Verilen bir Array'den istenen degere esit olan elemanlari kaldirip,kalanlari yeni bir Array olarak
        //yazdiran bir method yaziniz
        int [] sayilar={2,5,3,7,54,23,5};
        System.out.println(Arrays.toString(sayilar));
        Scanner scanner=new Scanner(System.in);
        System.out.println("silmek istediginiz degeri girin");
        int deger= scanner.nextInt();


       List<Integer> yeniSayilar= new ArrayList<>();
        
        for (int i = 0; i < sayilar.length ; i++) {

                if(sayilar[i]!=deger){
                     yeniSayilar.add(sayilar[i]);
                }
        }
        System.out.println("yeniSayilar = " + yeniSayilar);
        int[] yeniArray= new int[yeniSayilar.size()];

        for (int i = 0; i < yeniSayilar.size() ; i++) {
            yeniArray[i] = yeniSayilar.get(i);

        }
        System.out.println("yeniArray = " + Arrays.toString(yeniArray));
           /*
            Integer[] yeniArray=yeniSayilar.toArray(new Integer[0]);

        System.out.println("yeniArray = " + Arrays.toString(yeniArray));  //bu sekildede cevrilebilinir
            */

        }




            
        }

        


