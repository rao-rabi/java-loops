import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //sum of first n natural numbers
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            sum = sum+=i;
        }
        System.out.println("Sum of first natural numbers till "+ num +" is: " +sum);

        //print the table of number input by user.
        System.out.print("Enter a number to get its table: ");
        int numTable = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(numTable + " x " + i + " = " + numTable*i);
        }
    }
}
