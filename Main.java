// Even Or Odd program
package com.Damodar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter any number ?");
        int num= input.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}
