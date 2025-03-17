import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Number " );
        int number = scanner.nextInt();

        Primary input = new Primary();
        input.setNumber(number);

       Prosses output = new Prosses();
        output.prim(number,input.Prim());
    }
}