//Print all even numbers till n

import java.util.*;
public class even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number:");
        int n = sc.nextInt();
        int even;
        for(int i=1;i<=n;i+=2){
           
            System.out.println(i);
        }
    }
}