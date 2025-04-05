package CSV_Data_Handling.Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path)) ){
            writer.write("ID,Name,Department,Salary\n");
            writer.write("104,Alice Williams,Finance,62000\n");
            writer.write("105,Bob Johnson,Sales,58000\n");
            System.out.println("CSV file written successfully!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
