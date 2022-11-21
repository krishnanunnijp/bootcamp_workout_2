import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=1;
        int input1;
        int input2;
        int input3;
        while(input!=0) {
            System.out.println("1.largest of three number");
            System.out.println("2.smallest of three number");
            System.out.println("3.Check prime or not");
            System.out.println("4.check even number or not");
            System.out.println("5.Reverse of a number ");
            System.out.println("0.exit ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                     input1= sc.nextInt();
                     input2 = sc.nextInt();
                     input3 = sc.nextInt();
                    System.out.println(largestOfThree(input1,input2,input3));
                    break;
                case 2:
                    input1= sc.nextInt();
                    input2 = sc.nextInt();
                    input3 = sc.nextInt();
                    System.out.println(smallestOfThree(input1,input2,input3));
                    break;


                default :
                    System.out.println("see you again !!!");
            }


        }
    }

    private static int largestOfThree(int input1, int input2, int input3) {
        if(input1>input2 && input1>input3) {
            return input1;
        }
        else if(input2>input1 && input2>input3) {
            return input2;
        }else{
            return input3;
        }
    }
    private static int smallestOfThree(int input1, int input2, int input3) {
        if(input1<input2 && input1<input3) {
            return input1;
        }
        else if(input2<input1 && input2<input3) {
            return input2;
        }else{
            return input3;
        }
    }
}