package org.example.algoritms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 Given an array of integers, find the sum of its elements.
 For example, if the array , , so return .

 Function Description
 Complete the simpleArraySum function in the editor below. It must return the sum of
 the array elements as an integer.

 simpleArraySum has the following parameter(s):

 ar: an array of integers
 Input Format
 The first line contains an integer, , denoting the size of the array.
 The second line contains  space-separated integers representing the array's elements.

 Constraints

 Output Format
 Print the sum of the array's elements as a single integer.
 * */

public class SumIntegerArr {
    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result3.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
class Result3 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        return ar.stream().mapToInt(Integer::intValue).sum();

    }

}
