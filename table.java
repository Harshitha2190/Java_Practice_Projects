//Print the table of number input by a user

import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which the table should be displayed");
        int n = sc.nextInt();
        int t=0;
        for(int i=1;i<=10;i++){
            t=n*i;
            System.out.println(t);                                                                                                           
        }
    }
}