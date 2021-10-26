package com.javacode;
import java.util.Scanner;
import java.io.*;

public class hacker1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=a;
            for (int j=0;j<n;j++){
                c += Math.pow(2,j)*b;
                System.out.printf("%s ",c);
            }
            if (i < t-1) {
                System.out.print("\n");
            }
        }
    }
}
