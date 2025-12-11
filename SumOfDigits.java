import java.util.Scanner;
class SumOfDigits{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int sum=(num%10)+((num/10)%10)+(num/100);
    System.out.println("Sum of the digit of the number "+num+" is "+sum);
  }
}
