// Simple interest calculation program
package com.Damodar;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter p,t,r values");
        int  p= input.nextInt();
        byte t= input.nextByte();
        byte r= input.nextByte();
        int si= (p*t*r)/100; // formula of a simple interest
        System.out.println(si);
    }
}
