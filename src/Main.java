import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=1;
        while(input!=0) {
            System.out.println("1.largest of three number");
            System.out.println("2.smallest of three number");
            System.out.println("3.Check prime or not");
            System.out.println("4.check even number or not");
            System.out.println("5.Reverse of a number ");
            System.out.println("0.exit ");
            input = sc.nextInt();
        }
    }
}