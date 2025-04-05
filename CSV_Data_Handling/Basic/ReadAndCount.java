package CSV_Data_Handling.Basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            int count = 0;
            while((line = br.readLine())!= null){
                count ++;

            }
            System.out.println("count = "+count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
