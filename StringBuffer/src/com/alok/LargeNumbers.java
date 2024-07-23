package com.alok;

import java.math.BigInteger;
import java.math.BigDecimal;

public class LargeNumbers {
    public static void main(String[] args) {
        BD();
        int a = 30;
        int b  = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(34562562);
        int f = B.intValue();
        System.out.println(f);
        BigInteger C =  new BigInteger("354614646848489351");
        BigInteger X =  new BigInteger("254614646848489351");

        BigInteger D = BigInteger.TEN;
        BigInteger s = C.add(X);
        System.out.println(s);
        System.out.println(C);
        BigInteger m =C.multiply(X);
        System.out.println(m);
        BigInteger sub = C.subtract(X);
        System.out.println(sub);
        BigInteger d = X.divide(C);
        BigInteger rem = C.remainder(X);
        if (X.compareTo(C) < 0){
            System.out.println("Yes");
        }
        System.out.println(rem);
        System.out.println(d);
        System.out.println(Factorial.fact(100));

    }
    static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal answer = Y.subtract(X);
        System.out.println(answer);
        BigDecimal a = new BigDecimal("216165132.511898181");
        BigDecimal b = new BigDecimal("15185132.1781616552");
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        BigDecimal con = BigDecimal.ONE;
        }

    }
