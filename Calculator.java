//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("Enter any operator(+,-,*,/,%)");
        char op = sc.next().charAt(0);
        double result;
        switch(op){
            case '+' : result = a+b;
            System.out.println(result);
            break;
            case '-' : result = a-b;
            System.out.println(result);
            break;
            case '*' : result = a*b;
            System.out.println(result);
            break;
            case '/' : result = a/b;
            System.out.println(result);
            break;
            case '%' : result = a%b;
            System.out.println(result);
            break;
            default : System.out.println("Invalid Input");
        }
    }
}