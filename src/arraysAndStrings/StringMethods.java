//Strings: It is collection of characters
// String s = "Welcome";

// length(): It returns count of total number of characters present in the string.
// concat(): Combines a specific string at the end of another string and ultimately returns a combined string. It is like appending another string.
// trim(): Removes the left and right extra spaces from the string.

// CharAt(): Returns a char value at the given index number. The index starts from 0.
// contains(): Searches the sequence os characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.
// equals(): Compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
// equalsIgnoreCase(): Compares two strings on the basis of content, but it does not check the case like equals() method. In this method, if the characters match, it returns true else false.

// replace(): Returns a string, replacing all the old characters or CharSequence to new characters. There are 2 ways to replace method.

// substring(): Returns substring of a string based on starting index and ending index. Starting index starts from 0 and ending index starts from 1.

// toLowerCase(): Returns the string in lower case letter.
// toUpperCase(): Returns the string in upper case letter.

package arraysAndStrings;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String s = "Welcome";
        String s1 = " to Java";

        System.out.println(s.length()); // Length of a string
        System.out.println();

        System.out.println(s.concat(s1)); // joining of Strings
        System.out.println();

        s = "    Welcome     ";
        System.out.println("Before trimming string is: " + s);
        System.out.println("After trimming string is: " + s.trim()); // IT will remove only spaces and no characters
        System.out.println();

        // charAt()
        s = "Welcome";
        System.out.println(s.charAt(4)); // Returns character based on index number, index will start from 0
        System.out.println();

        // contains()
        s = "Welcome";
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("wel"));
        System.out.println(s.contains("com"));
        System.out.println();

        // Comparing string using equals()
        s = "Welcome";
        s1 = "welcome";
        System.out.println(s.equals("Welcome"));
        System.out.println(s.equals(s1));
        System.out.println();

        // Comparing string using equalsIgnoreCase()
        s = "Welcome";
        s1 = "welcome";
        System.out.println(s.equalsIgnoreCase("WELCOME"));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println();

        // Replacing characters using replace()
        s = "Welcome to Java";
        System.out.println(s.replace('o', 'i'));
        System.out.println(s.replace("Java", "Selenium"));
        System.out.println();

        // Extracting substring from the main string
        s = "Welcome";
        System.out.println(s.substring(0, 4));
        System.out.println();

        // Converting case
        s = "WELCOME";
        System.out.println(s.toLowerCase());

        s = "welcome";
        System.out.println(s.toUpperCase());
    }
}
