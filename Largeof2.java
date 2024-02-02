// Finding largest of two numbers
package com.Damodar;

import java.util.Scanner;

public class Largeof2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        if(num1 == num2)
            System.out.println("Provided Equal numbers");

        if(num1>num2)
            System.out.println(num1 +" is Largest");
        else
            System.out.println(num2 +" is Largest");

    }
}
