import java.util.Scanner;

public class SumOf2Numbers {

    public static void main(String args[]) {

        int x, y, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");  
        x = sc.nextInt();  

        System.out.println("Enter the second number: ");  
        y = sc.nextInt();  

        sum=x+y;

        System.out.println("The sum of two numbers x and y is: " + sum);  
    }  
}
