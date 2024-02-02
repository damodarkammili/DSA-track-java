// Program to check whether a number Armstrong or not
package com.Damodar;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number");
        int num=input.nextInt();
        int r=0;
        int sum=0;
        int t=num;

        while(num!=0) {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if(sum==t)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
