package day22_OdevMultiDimensionalArrays;

public class C03_AyniIndexlerinToplami {
    public static void main(String[] args) {
        //asagidaki multi dimensional arraylerin ic arraylerindeki ayni indexe sahip elemanlari
        //toplamini ekrana yazdirin

        int [][] arr1={{1,2},{3,4,5},{6}};
        int [][] arr2={{7,8,9},{10,11},{12}};
           int toplam=0;
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                for (int k = 0; k < arr2.length ; k++) {
                    for (int l = 0; l <arr2[k].length ; l++) {
                        if(i==k&&j==l)
                        {
                            toplam+=arr1[i][j]+ arr2[k][l];

                        }
                    }

                }

            }

        }
        System.out.println("toplam = " + toplam);
    }
}
