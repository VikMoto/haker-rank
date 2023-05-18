package org.example.algoritms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStaircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }

    private static void staircase(int n) {
        String spase = " ";
        String stairs = "#";

        for (int i = 1; i <= n; i++) {
            String repeatSpace = spase.repeat( n - i );
            String repeatStairs = stairs.repeat(  i );
            System.out.println(repeatSpace + repeatStairs );
        }
    }

}
