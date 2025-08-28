import java.util.*;


class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter number of iterations : ");
                int t = in.nextInt();

                for (int i = 0; i < t; i++) {
                    System.out.print("Enter A : ");
                    int a = in.nextInt();
                    System.out.print("Enter b : ");
                    int b = in.nextInt();
                    System.out.print("Enter N : ");
                    int n = in.nextInt();

                    double seq = a + (Math.pow(2, 0) * b);
                    System.out.print("corresponding series --> " + (int) seq + " ");
                    for (int j = 1; j < n; j++) {
                        seq = seq + Math.pow(2, j) * b;
                        int ans = (int) seq;
                        System.out.print(ans + " ");
                    }
                    System.out.println("\n");

                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error -> " + e);
                in.nextLine();

            }
        }
    }


}
