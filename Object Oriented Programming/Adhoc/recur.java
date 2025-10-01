public class recur {
    //int sum = 0;
    static void print(int n , int sum){ // printing sum using recurrsion
        sum = sum + n;
        if (n == 11) {
            return;
        }
         System.out.println(sum);;
        print(n+1,sum);
    }
   
    // static void print1(int n){
    //     System.out.println(n);
    // }
    static void sum(int sum){ // print sum using for loop
    for(int i =1 ; i<=10 ; i++){
         sum = sum + i;
        }
        System.out.println(sum);

    }
    static void fibo(){
        int sum = 0;
        for (int i = 0; i<=10; i++){
            for(int j = i +1; j<=10; j++){
                sum = i + j ;
                sum = sum +i;
               
            }
             System.out.println(sum);
        }
    }
    static int fib(int n){
        if (n < 2 ){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

 public static void main(String args[]){
        int n = 4;
        int sum = 0;
         //sum(sum);
     //print(n, sum);
       int p = fib(n);
       System.out.println(p);
    }

}
