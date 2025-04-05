package CSV_Data_Handling.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        System.out.println("Enter word to search ");
        String word = sc.nextLine();
                boolean flag = false;
                try (BufferedReader re = new BufferedReader(new FileReader(path))) {
                    String line;
                    while ((line = re.readLine()) != null) {
                        String[] col = line.split("\\s+");

                        for(String cols : col){
                            if(cols.equalsIgnoreCase(word)){
                                flag = true;
                                break;
                            }
                        }

                    }

                    if(flag){
                        System.out.println("Yes "+word+" is present");
                    }else{
                        System.out.print("No "+word+" rahul is not present");
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }


