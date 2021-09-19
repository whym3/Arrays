package dsa450;

import java.util.Arrays;
import java.util.Scanner;

public class Array_kth_minmax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1028,5,6,7,8,9,10,0};
        Arrays.stream(arr).sorted();
        System.out.print("k = ");
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        System.out.println(arr[k]);
    }
}
