import java.util.*;

public class arrayoperations {
   static Scanner scan = new Scanner(System.in);
    public static void itterate(){
        int[] arr = new int[5];
        //reading the input from user
        for (int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        // printing the array elements
            System.out.println(Arrays.toString(arr));

    }

// insertion of elements
    public static void insert(){
        int[] arr1 = new int[5];
        for (int i =0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Before inserting the array" + Arrays.toString(arr1));
        System.out.println("the array size is " + arr1.length + " enter the value and the index of element ");
         int value = scan.nextInt();
         int index = scan.nextInt();
         arr1[index] = value;
        System.out.println("after inserting the array" + Arrays.toString(arr1));

    }


    public static void insertShift() {
        
        int[] arr1 = new int[5];
        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Before insertion: " + Arrays.toString(arr1));

       
        System.out.println("Enter the value and the index to insert:");
        int value = scan.nextInt();
        int index = scan.nextInt();

        // New array of size +1
        int[] arr2 = new int[arr1.length + 1];

        // Step 1: copy elements before index
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];
        }
        // Step 2: insert new value
        arr2[index] = value;

        // Step 3: copy remaining elements shifted by 1
        for (int i = index; i < arr1.length; i++) {
            arr2[i + 1] = arr1[i];
        }

        System.out.println("After insertion: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        // main method
        //itterate();
        //insert();
        insertShift();
    }
}


