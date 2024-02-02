package com.Damodar;

public class Fibanacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2= 1;
        int n3;
        int i=0,n=10;
        System.out.println(n1);
        System.out.println(n2);

        for(i=2;i<n;++i){
                n3 = n1 + n2;
                n1 = n2;           //first we need to copy n2 into n1
                n2 = n3;           // n2 should be stored while we store n3 into n2
                System.out.println(n3);

       }
    }
}
