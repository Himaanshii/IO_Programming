package CSV_Data_Handling.Advanced;

import java.io.*;
import java.util.Scanner;

public class MergeTwoCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file1");
        String sourceFileName = sc.nextLine();
        System.out.println("Enter path of the file1");
        String targetFileName = sc.nextLine();
        merge(sourceFileName, targetFileName);
    }
    public static void merge(String sourceFileName , String targetFileName){
        try{
            File sourceFile = new File(sourceFileName);
            if(sourceFile.exists()){
                FileInputStream finput = new FileInputStream(sourceFile);
                FileOutputStream foutput = new FileOutputStream(new File(targetFileName) , true);
                foutput.write(finput.readAllBytes());
                foutput.close();
                finput.close();
            }else{
                System.out.println("Source File doesn't exists. ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
