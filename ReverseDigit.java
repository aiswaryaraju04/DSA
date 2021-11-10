package com.aiswarya;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits to be reversed :");
        int n = sc.nextInt();
        System.out.print("\nEnter the number of digits :");
        int num = sc.nextInt();
        int count=0;
        int temp =0;
        while (n>0 && count <= num)
        {
            int rem = n % 10;
            n /= 10;
            temp = temp * 10 + rem;
        }
        count++;
        System.out.println("Reversed digits are : "+ temp);
    }
}
