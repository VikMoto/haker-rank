package org.example.algoritms;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.*;

public class BalancedParentheses {
    public static void main(String []argh) throws FileNotFoundException {
        String file = "src/main/resources/balanced-parentheses.txt";
        Scanner sc = new Scanner( new File( file ) );
        List<String> inputStr = new ArrayList<>();

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println( "input = " + input );
            System.out.println( "isBalanced( input ) = " + isBalanced( input ) );
            //Complete the code
        }

        sc.close();
    }

    private static boolean isBalanced(String line) {
        Queue<Character> stack = new LinkedList<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt( i );
            if (ch == '(' || ch =='{' || ch == '[') {
                stack.add( ch );

            }else if (ch == ')' || ch =='}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char close = stack.poll();
            }

        }
    return stack.isEmpty();
    }
}
