package Array;

import java.util.Arrays;

public class remove1 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int res[]=new int[arr.length-1];
        int tar=4;
        int ind=0;
        rev(arr,res,tar,ind);
    }
    static void rev(int arr[],int res[],int tar,int ind){
        int i=0;
        while (i<arr.length-1){
            if (arr[i]==tar){
                ind=i;
                break;
            }
            res[i]=arr[i];
            i++;
        }
        for (i=ind;i< res.length;i++){
            res[i]=arr[i+1];
        }
        System.out.println("Previous Array:-");
        System.out.println(Arrays.toString(arr));
//        for (int a:res){
//            System.out.println(a);
//        }
           System.out.println("After removing element from array:-");
        System.out.println(Arrays.toString(res));
    }
}
