package Array;

public class minmax {
    public static void main(String[] args) {
        int arr[]={12,23,34,11};
        min(arr);
        max(arr);
    }
    static void min(int []arr){
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    static void max(int arr[]){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
