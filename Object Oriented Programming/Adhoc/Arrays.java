import java.util.*; 
public class arrays {
    public static void als(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for ( int i =0; i< 100; i++){
            arr2.add(sc.nextInt());
        }
        // for ( int i=0; i< 100; i++){
        //     arr2.get(i);
        //     arr2.get(i).add(sc.nextInt());
        // }
        
        System.out.println(arr2);
    }
    public static void prob(int[] arr, int i, int j){
        System.out.println("Array before swapping: " +  Arrays.toString(arr));   
        int temp = arr[i];
           arr[i] = arr[j];
           arr[j]= temp;
           System.out.println("Array swapping: " + Arrays.toString(arr));
    }
    public static void prob1(int[] arr){
        int max = arr[0]; // assume first element is max
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i]; // update max if current element is bigger
    }
}
System.out.println("Maximum element: " + max);
    }

     static void two(){
        int[][] arr2d = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<3;i++){
            for (int j=0; j<4;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        for(int i =0; i<3;i++){
            for (int j=0; j<4;j++){
                System.out.println(arr2d[i][j]);
            }
            System.out.println();
        }
         
    //System.out.println(Arrays.deepToString(arr2d));
    }
     static String[] strinarrays(){
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[5];
        for (int i=0; i< arr1.length;i++){
            arr1[i] = sc.next();
        }
        arr1[1] = "sagar";
        return arr1;
    }
     static void primarray(){
        Scanner sc = new Scanner(System.in);
        int[] arr11 = new int[4];
        for (int i = 0; i < 3; i++){
           arr11[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
          System.out.println(Arrays.toString(arr11));
        }
        for ( int num : arr11){
            System.out.println(num);
        }
    }
public static void prob3(int arr[]){
    int[] arr2 = new int[5];
    for(int i = 4; i>=0;i--){
        System.out.println(arr[i]);
        arr2[i] = arr[i];
    }
    for(int i = 4; i>=0;i--){
        System.out.println(arr2[i]);}
    //System.out.println(Arrays.toString(arr2));

}



    public static void main(String args[]){
        //primarray();
        //String[] q = strinarrays();
       //System.out.println(Arrays.toString(q));
        //  two();
       // als();
        int[] arr = {1,2,3,4,5};
        prob3(arr);


    }
}
