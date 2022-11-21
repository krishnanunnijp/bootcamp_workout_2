import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        int input1;
        int input2;
        int input3;
        while (input != 0) {
            System.out.println("1.largest of three number");
            System.out.println("2.smallest of three number");
            System.out.println("3.Check prime or not");
            System.out.println("4.check even number or not");
            System.out.println("5.Reverse of a number ");
            System.out.println("0.exit ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    input3 = sc.nextInt();
                    System.out.println(largestOfThree(input1, input2, input3));
                    break;
                case 2:
                    input1 = sc.nextInt();
                    input2 = sc.nextInt();
                    input3 = sc.nextInt();
                    System.out.println(smallestOfThree(input1, input2, input3));
                    break;
                case 3:
                    input1 = sc.nextInt();
                    System.out.println(primeOrNot(input1));
                    break;
                case 4:
                    input1 = sc.nextInt();
                    System.out.println(evenOrNot(input1));
                    break;
                case 5:
                    input1 = sc.nextInt();
                    System.out.println(Reverse(input1));
                    break;



                case 0:
                    System.out.println("see you again !!!");
            }


        }
    }

    private static int Reverse(int input1) {

        int value=input1,reverse=0;
        while(value!=0){
            reverse=reverse*10+(value%10);
            value=value/10;
        }
        return reverse;
    }


    private static int largestOfThree(int input1, int input2, int input3) {
        if (input1 > input2 && input1 > input3) {
            return input1;
        } else if (input2 > input1 && input2 > input3) {
            return input2;
        } else {
            return input3;
        }
    }

    private static int smallestOfThree(int input1, int input2, int input3) {
        if (input1 < input2 && input1 < input3) {
            return input1;
        } else if (input2 < input1 && input2 < input3) {
            return input2;
        } else {
            return input3;
        }
    }
    private static String evenOrNot(int input1) {
        if(input1%2==0){
            return "even number";
        }else {
            return "not a even number";
        }
    }

    private static String primeOrNot(int input1) {
        if(input1==2 && input1==1){
            return "prime number";
        }
        int flag = 0;
        for (int i = 2; i < input1 / 2; i++) {
            if (input1 % i == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return "prime number";
        } else {
            return "not a prime number";
        }
    }
}