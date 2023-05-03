package com.java.javaproject2_1.Week3.day3;

public class IsPrimeBreak {
    public static void main(String[] args) {
        int num = 992; // 소수 2_500_000
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
