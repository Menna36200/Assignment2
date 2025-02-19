import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Enter The Number: ");
        int num;
        boolean n = false;
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        for(int i =2 ;i<num;i++)
        {
            if(num % i ==0 )
            {
           n = true;
           break;
            }
        }
        if(n==true)
        {
            System.out.println("The " +num+ " is not prime number");
        }
        else
        {
            System.out.println("The " +num+ " is prime number");
        }
    }

}