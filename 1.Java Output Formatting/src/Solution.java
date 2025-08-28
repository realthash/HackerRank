//Input Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of 10 alphabetic characters, and each integer
// will be in the inclusive range from 0 to 999.

//Output Format
//
//In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly 15 characters.
//The second column contains the integer, expressed in exactly  digits; if the original input has
// less than three digits, you must pad your output's leading 3 digits with zeroes.

 import java.util.Scanner;

 public class Solution {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] words = new String[3];
            int[] numbers = new int[3];




                try {
                    for(int i=0;i<3;i++) {
                        System.out.println();
                        System.out.print("Enter a word " + (i + 1) + ": ");
                        String s1 = sc.next();
                        System.out.print("Enter a number " + (i + 1) + ": ");
                        int x = sc.nextInt();
                        sc.nextLine(); // clear the buffer
                        //Complete this line
                        if (s1.length() > 10 || x > 999 || x < 0) {
                            System.out.println("Invalid input, please try again.");
                            i--; // retry the same index
                            continue;
                        }

                        //adding to the arrays
                        words[i] = s1;

                        numbers[i] = x;
                    }
                    System.out.println("================================");
                    for ( int j = 0; j< words.length; j++){
                        String word = words[j];
                        int number = numbers[j];

                        //formatting the correct way
                        System.out.printf("%-15s%03d\n",word, number  );
                    }

                    System.out.println("================================");

                } catch (Exception e) {
                    System.out.println("Error has been occurred");
                    sc.nextLine();
                }





            sc.close();

        }
    }
