import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest 
                = MessageDigest.getInstance("MD5");
            messageDigest.update(message.getBytes());
            byte[] hash = messageDigest.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {}
    }
}
