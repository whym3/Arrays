package dsa450;

import java.util.Arrays;

public class Array_0_1_2 {
//    public static void swap(int x,int y){
//        int temp= x;
//        x=y;
//        y=temp;
//    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int m=0,h=arr.length-1,l=0;

        while (m<=h){
            if (arr[m]==0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;

                l++; m++;
            }

            if (arr[m] == 1){
                m++;
            }

            if (arr[m] == 2){
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
