package org.example;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag and
 * an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
 *
 * Given a string of text in a tag-based language, parse this text and retrieve the contents
 * enclosed within sequences of well-organized tags meeting the following criterion:
 *
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2>
 * is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
 *
 * Tags can be nested, but content between nested tags is considered not valid. For example,
 * in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
 *
 * Tags can consist of any printable characters.
 *
 * Input Format
 *
 * The first line of input contains a single integer,  (the number of lines).
 * The  subsequent lines each contain a line of text.
 *
 * Constraints
 *
 * Each line contains a maximum of  printable characters.
 * The total number of characters in all test cases will not exceed .
 * Output Format
 *
 * For each line, print the content enclosed within valid tags.
 * If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.
 The regular expression "<([\\w]+)>([^<]+)</\\1>" is used to match and extract the contents
 enclosed within valid tags in a tag-based language.

 Let's break down the regular expression:

 < and >: These characters represent the literal opening and closing angle brackets used in
 the start and end tags.

 ([\\w]+): This part matches one or more word characters (letters, digits, or underscores)
 and captures them in a group. This represents the tag name.

 >: This character represents the literal closing angle bracket that follows the start tag.

 ([^<]+): This part matches one or more characters that are not the opening angle bracket
 ("<") and captures them in a group. This represents the content within the tags.

 </: This part matches the literal sequence "</" that precedes the end tag.

 \\1: This backreference refers to the value captured in the first group, which represents
 the tag name. The purpose of this backreference is to ensure that the start and end tags
 have the same name.

 >: This character represents the literal closing angle bracket that follows the end tag.

 In summary, the regular expression matches a sequence that starts with an opening tag,
 followed by some content, and ends with a matching closing tag. The tag name in the start
 and end tags must be the same, ensuring they are well-organized tags. The content within
 the tags is captured and can be retrieved using the Matcher object in Java.
 * */

public class ContentExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String line = scanner.nextLine();
            extractValidTags(line);
            n--;
        }

        scanner.close();
    }

    private static void extractValidTags(String line) {
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);
        boolean foundValidTag = false;

        while (matcher.find()) {
            System.out.println(matcher.group(2));
            foundValidTag = true;
        }

        if (!foundValidTag) {
            System.out.println("None");
        }
    }

}
