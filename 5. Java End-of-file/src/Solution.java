import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberLine = 0;
        String line;
        try{
        while((line = reader.readLine()) != null ){

                System.out.println(numberLine+line);
                numberLine++;
            }
            }catch(IOException e){
                System.out.println("Error");


        }

    }
}
