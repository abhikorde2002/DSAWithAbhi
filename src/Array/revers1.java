package Array;

import java.util.Arrays;

public class revers1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        rev(arr);
    }
    static void rev(int arr[]){
        for (int i=0;i< arr.length/2;i++){
            int tem=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tem;
        }
        System.out.println(Arrays.toString(arr));
    }
}
