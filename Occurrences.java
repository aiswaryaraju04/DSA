package com.aiswarya;

import java.util.Scanner;

public class Occurrence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int num = sc.nextInt();
        int rem=0; int count = 0;
        while (num>0)
        {
            rem = num%10;
            if(rem==3)
            {
                count++;
            }
            num = num/10;
        }
        System.out.println("Number of Occurrences :" + count);
    }
}
