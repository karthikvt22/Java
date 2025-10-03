import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));
        for (int i =0; i<5;i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
         arrays Strings;
      String[] str = new String[5];
       str[0]= "vt";
       str[1] ="ka";
        str[2] = "rt";
       str[3] = "hi";
        str[4] = "k";
        System.out.println(Arrays.toString(str));
        fill2d();
        twoarray();
        passing(arr);
        fill2dscan();
        arraylist();
        System.out.println(Arrays.toString(arr));
    }

    //passing in functions
    public static void passing(int arr[]){
       int i =5;
            for (int j = 0; j < 5; j++) {
                arr[j] = i;
                i++;
            }

        System.out.println(Arrays.toString(arr));
    }

    // 2d array
    public static void twoarray(){
        //new int[3][];
        int[][] arr2 = {
                {2,3},
                {4,5,6,9,8,7,6,5},
                 {7,8},
    };
        System.out.println(Arrays.deepToString(arr2));
    }

    // filling the 2d array
    public static void fill2d(){
        int rows = 5;
        int cols =11;
        int[][] arr2 = new int[rows][cols];
        for ( int i =0; i<rows;i++){
            for (int j = 0; j<cols; j++){
                arr2[i][j] = i*j+1;
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }

    // filling the 2d array using user input

    public static void fill2dscan(){
        Scanner scan =new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] arr2d = new int[rows][cols];
        for(int i = 0; i<rows;i++){
            for(int j =0;j<arr2d[i].length; j++){
                arr2d[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr2d));
        System.out.println(arr2d.length);
    }

    //Arraylist

    public static void arraylist(){
        ArrayList<Integer> arr1 = new ArrayList<>(15);
        //System.out.println(arr1.get(0));
        arr1.add(45);
        arr1.add(33);
        arr1.add(24);
        arr1.add(56);
        System.out.println(arr1);
        arr1.remove(3);
        System.out.println(arr1);
        arr1.set(2,22);
        System.out.println(arr1);

    }
}
