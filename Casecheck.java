package com.conditionals;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        char ch= s.next().trim().charAt(0);// There is no way to take input character like s.nextChar();
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else
            System.out.println("uppercase");


    }

}
