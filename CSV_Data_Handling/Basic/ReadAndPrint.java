package CSV_Data_Handling.Basic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine())!= null){
                String[] columns = line.split(",");
                System.out.println("ID: " + columns[0] + ", Name: " + columns[0]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
