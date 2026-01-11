import java.util.Scanner;
public class SumEvenOddPro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sumEven = 0;
        long productOdd = 1;  
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                productOdd *= i;
            }
        }
        System.out.println("Sum of all even numbers from 1 to " + n + " = " + sumEven);
        System.out.println("Product of all odd numbers from 1 to " + n + " = " + productOdd);
        sc.close();
    }
}
