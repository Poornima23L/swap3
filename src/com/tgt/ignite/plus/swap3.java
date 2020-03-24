package com.tgt.ignite.plus;

public class swap3 {
    public static void main(String[] args){
        int a,b,c,t;
        a=10;
        b=20;
        c=30;
        t=c;
        c=b;
        b=a;
        a=t;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}
