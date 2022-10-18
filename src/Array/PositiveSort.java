package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PositiveSort {
    public static void main(String[] args) {
        int arr[]={1,-2,-5,3,1,9};
        int index=0;
        int target[]=new int[arr.length];
        positive(arr,target,index);
    }
    static void positive(int arr[],int target[],int index){
        for (int i=0;i< arr.length;i++){
            if (arr[i]>0){
                target[index++]=arr[i];
            }
        }
        for (int i=0;i< arr.length;i++) {
            if (arr[i] < 0) {
                target[index++] = arr[i];
            }
        }
        for (int a:target){
            System.out.println(a);
        }
    }
}
