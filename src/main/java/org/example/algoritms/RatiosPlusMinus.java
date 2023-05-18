package org.example.algoritms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class RatiosPlusMinus {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());

//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        final List<Integer> integers = List.of( -4, 3, -9, 0, 4, 1 );
        Result9.plusMinus(integers);
//        Result9.plusMinus(arr);

//        bufferedReader.close();
    }
}

class Result9 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;

        for (Integer integer : arr) {
            if (integer > 0) countPlus++;
            if (integer < 0) countMinus++;
            if (integer == 0) countZero++;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        System.out.println(decimalFormat.format (countPlus/ (double)arr.size()) );
        System.out.println(decimalFormat.format(countMinus/(double) arr.size()) );
        System.out.println(decimalFormat.format(countZero/ (double)arr.size()) );

    }

}

