package com.conditionals;

import java.util.Scanner;

public class Fibanacci {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter num of terms you need in Fibanaci");
        int n=s.nextInt() ;
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int c=a+b;            // I find next term(c) by adding a+b
                a=b;              // copying 'b' into a ---means to make a as 'b'
                b=c;              // copying 'c' into b ---that means make new term as b
            System.out.println(c);
            count++;
        }

    }
}
