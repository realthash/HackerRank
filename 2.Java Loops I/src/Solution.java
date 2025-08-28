//Objective
//        In this challenge, we're going to use loops to help us do some simple math.
//
//Task
//   Given an integer, N, print its first 10 multiples.
//   Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form: N x i = result.
//Input Format
//A single integer, N.

//Constraints
//  2 <= N <= 20

//Output Format
    //Print  lines of output; each line  (where 1 <= i <= 10) contains the  of N x i in the form:
    //  N x i = result.

import java.io.*;
import java.io.IOException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            try {
                System.out.println("Enter a number : ");
                int N = Integer.parseInt(bufferedReader.readLine().trim());
                if (N <= 20 && N >= 2) {
                    for (int i = 1; i <= 10; i++) {
                        int ans = N * i;

                        System.out.printf("%02d x %02d = %d%n", N, i, ans);
                    }
                    break;
                } else {
                    System.out.println("Input should be 1 < N < 20. Try again.");
                }



            } catch (NumberFormatException e) {
                System.out.println("Number is too large to parse. Try again");

            }
        }
        bufferedReader.close();

    }
}
