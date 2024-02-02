// Program to find the no of dollars for an amount to be given
package com.Damodar;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter 1$ value in rupees");
        float Dollar= input.nextFloat();
        System.out.println("enter the amount to change in $");
        int Amount = input.nextInt() ;

        System.out.println("Equivalent dollars are ="+(Amount/Dollar));



    }

}
