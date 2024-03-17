import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner $i = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = $i.nextInt();

        if( n > 0){
            System.out.println("The number is positive");
        }else if(n < 0){
            System.out.println("The number is negative");
        }else if(n == 0){
            System.out.println("The value equals 0");
        }

    }
}