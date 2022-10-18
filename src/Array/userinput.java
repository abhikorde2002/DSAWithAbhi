package Array;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the length:-");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        //Enter the array
        int array[]=new int[n];
        System.out.println("Enter the element");
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
