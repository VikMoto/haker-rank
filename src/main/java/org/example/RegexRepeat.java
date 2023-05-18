package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 In this challenge, we use regular expressions (RegEx) to remove instances of words that are
 repeated more than once, but retain the first occurrence of any case-insensitive repeated
 word. For example, the words love and to are repeated in the sentence I love Love to To tO
 code. Can you complete the code in the editor so it will turn I love Love to To tO code into
 I love to code?

 To solve this challenge, complete the following three lines:

 Write a RegEx that will match any repeated word.
 Complete the second compile argument so that the compiled RegEx is case-insensitive.
 Write the two necessary arguments for replaceAll such that each repeated word is replaced
 with the very first instance the word found in the sentence. It must be the exact first
 occurrence of the word, as the expected output is case-sensitive.
 Note: This challenge uses a custom checker; you will fail the challenge if you modify
 anything other than the three locations that the comments direct you to complete. To restore
 the editor's original stub code, create a new buffer by clicking on the branch icon in the
 top left of the editor.

 Input Format

 The following input is handled for you the given stub code:

 The first line contains an integer, , denoting the number of sentences.
 Each of the  subsequent lines contains a single sentence consisting of English alphabetic
 letters and whitespace characters.

 Constraints

 Each sentence consists of at most  English alphabetic letters and whitespaces.
 Output Format

 Stub code in the editor prints the sentence modified by the replaceAll line to stdout.
 The modified string must be a modified version of the initial sentence where all repeat
 occurrences of each word are removed.

 The regular expression "\b(\w+)(\s+\1\b)+" can be broken down as follows:

 "\b" - This is a word boundary anchor that matches the boundary between a word character and
 a non-word character. It ensures that the matching word is not part of a larger word.

 "(\w+)" - This is a capturing group that matches one or more word characters. It captures the
 repeated word that we want to remove.

 "(\s+\1\b)+" - This is a capturing group that matches one or more occurrences of whitespace
 characters followed by the exact word captured in the first group. It ensures that we match
 and remove all subsequent repeated occurrences of the word.

 Now let's break it down further:

 "\b(\w+)" - This matches the first occurrence of a word and captures it in the first group.
 The word is identified by one or more word characters (letters, digits, or underscores).

 "(\s+\1\b)+" - This matches one or more occurrences of whitespace characters followed by
 the exact word captured in the first group. The word must be followed by a word boundary
 to ensure it's a complete word. This part is responsible for identifying subsequent repeated
 occurrences of the word.

 In summary, the regular expression "\b(\w+)(\s+\1\b)+" matches and captures the first
 occurrence of a word, and then matches and captures subsequent repeated occurrences of
 the same word. This allows us to identify and remove the repeated occurrences while
 retaining the first occurrence.

 * */

public class RegexRepeat {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
