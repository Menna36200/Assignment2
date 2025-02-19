import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Enter The Number: ");
        int num;
        boolean a = false;
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        for(int i =2 ;i<num;i++)
        {
            if(num % i ==0 )
            {
           a = true;
           break;
            }
        }
        if(a)
        {
            System.out.println("The " +num+ " is not prime number");
        }
        else
        {
            System.out.println("The " +num+ " is prime number");
        }
    }

}