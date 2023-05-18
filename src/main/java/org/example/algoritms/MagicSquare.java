package org.example.algoritms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 We define a magic square to be an  matrix of distinct positive integers from
 to  where the sum of any row, column, or diagonal of length  is always equal
 to the same number: the magic constant.
 You will be given a  matrix  of integers in the inclusive range . We can convert
 any digit  to any other digit  in the range  at cost of . Given , convert it into
 a magic square at minimal cost. Print this cost on a new line.
 Note: The resulting magic square must contain distinct integers in the inclusive
 range .

 Example

 $s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]

 The matrix looks like this:

 5 3 4
 1 5 8
 6 4 2
 We can convert it to the following magic square:

 8 3 4
 1 5 9
 6 7 2
 This took three replacements at a cost of .

 Function Description

 Complete the formingMagicSquare function in the editor below.

 formingMagicSquare has the following parameter(s):

 int s[3][3]: a  array of integers
 Returns

 int: the minimal total cost of converting the input square to a magic square
 Input Format

 Each of the  lines contains three space-separated integers of row .

 Constraints

 Sample Input 0
 * */
public class MagicSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach( i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int formingMagicSquare(List<List<Integer>> s) {
        final int size = s.size();
        int[] sumRow = new int[3];
        int[] sumColumn = new int[3];
        int diag1 = 0;
        int diag2 = 0;
        final int[][] array = s.stream()
                .map( it -> it.stream().mapToInt( Integer::intValue ).toArray() )
                .toArray( int[][]::new );
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumRow[j] += array[i][j];
                sumColumn[j] += array[j][i];
                diag1 += array[j][j];
                diag2 += array[size - j - 1][j];
            }
        }
        if ()

            //difference min/max
            //add
            //if all sum == than return 0
            Math.
        }

    }
}
