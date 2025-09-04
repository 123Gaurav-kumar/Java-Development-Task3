import java.util.Scanner;
public class factorial{
    static int factorialNum(int n){
        if(n==0){
            return 1;
        }
        return n*factorialNum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number:");
        int n = sc.nextInt();
        System.out.println("Factorial of number is:");
        System.out.println(factorialNum(n));

        sc.close();
    }
    
}
