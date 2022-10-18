package Array;

import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element size:- ");
        int num= scanner.nextInt();
        int arr[]=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]= scanner.nextInt();
        }
        int b[]=new int[num];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            b[i]=arr[j];
            j++;
        }
        int c[]=new int[num];
        int k=0;
        for (int i= arr.length-1;i>=0;i--){
            c[i]=b[k];
            k++;
        }
        for (int a:c) {
            System.out.println(a);
        }
    }
}
