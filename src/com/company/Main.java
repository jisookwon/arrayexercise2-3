package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        int[] number = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number #" + (i+1));
            number[i]= keyboard.nextInt();
            System.out.println();
        }
        for (int i=0;i<10;i++) {

            for (int j=i+1; j<10;j++)
                if (number[i]=number[j]){
                    number[i]="";
                    j=10
            }
        }
    }
}
