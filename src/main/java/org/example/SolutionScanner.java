package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class SolutionScanner {
    static int B;
    static int H;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        try {
            if(B < 0 || H <0) {
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println( "java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(B * H);
    }
    public static String findDay(int month, int day, int year) {
        if(year > 2000 && year < 3000) {
            LocalDate date =  LocalDate.of(year, month, day);
            return date.getMonth().toString();
        }
        return null;
    }
}
