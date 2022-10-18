package Array;

import java.util.Scanner;

public class Findkey {
    public static void main(String[] args) {
        int len;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        len = scanner.nextInt();

        int arr[]=new int[len];
        System.out.println("Enter the array element:-");
        for (int i=0;i<len;i++){
            arr[i]= scanner.nextInt();
             
        }

    }

}
