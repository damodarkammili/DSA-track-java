// find the largest of the number among 3 numbers
package com.conditionals;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        //***First way of finding max value***//
//        int max = 0;
//        if (a > b) {
//            max = a;
//        }
//        if (b > c)
//            max = b;
//        else
//            max = c;
//        System.out.println(max);


        // ***Second way of finding max value****//

//        if (a > b && a > c) {    //false: we will get one value that a is smaller to that
//            System.out.println(a+" is max");
//        } else if (b > c)                  // here we are checking which one is bigger (b,c)
//            System.out.println(b+" is max");
//        else
//            System.out.println(c+" is max");


        // ***Third way of finding the largest***//

        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);



    }
}
