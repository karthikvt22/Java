import java.util.*;
public class swap {

   static void Swap(int[] arr,int a, int b){
        int temp =0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
       System.out.println(Arrays.toString(arr));

    }

    static void max(int[] arr){
       int max = arr[0];
       for (int i =1;i<arr.length;i++){
           if (arr[i] > max) {
               max = arr[i];
           }
       }
        System.out.println("The max element is" + max);
    }

    public static void main(String[] args) {
        int[] arr1 = {24,123,5532,565,3255};
        System.out.println(Arrays.toString(arr1));
        Swap(arr1,2,3);
        max(arr1);
    }
}

