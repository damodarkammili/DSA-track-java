package com.conditionals;

import java.util.Scanner;

public class RepeatNumberCount {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int c = 0;
    int rem = 0;

    while(n !=0) {
        rem = n % 10;
        if (rem == 3)     //checking whether 3 is there or not
            c = c + 1;      // incrementing the count

        n = n / 10;       //to get the number after removal of last digit
    }
        System.out.println(c);
}



}
