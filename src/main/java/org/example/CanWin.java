package org.example;

import java.util.Scanner;

public class CanWin {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i = 0;
        int gap = 0;
        int count = 0;
        boolean result = false;
        int n = game.length;
        while(game[i] == 0) {
            if ((i-1) >= 0) {
                if (game[i-1] == 0) {
                    gap = -1;
                    count++;
                }
            }

            if ((i+1) < n -1) {
                if (game[i+1] == 0 && (i+1) < n -1) {
                    gap = 1;
                    count++;
                }

            }


            if ((i + leap) < n  ) {

                if (game[i + leap] == 0 && (i + leap) < n) {
                    gap = leap;
                }

            } else {
                result = true;
                break;
            }
            if (i == n -1 || (i + leap) >= n) {
                result = true;
                break;
            }
            i += gap;
            if (count >= n || gap == 0) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
