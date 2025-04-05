package CSV_Data_Handling.Advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        try (BufferedReader re = new BufferedReader(new FileReader(path))) {
                    String line;

                    Map<String, Integer> employeeMap = new HashMap<>();
                    while ((line = re.readLine()) != null) {
                        String[] trm = line.split(" ");

                        if(employeeMap.containsKey(trm[0])){
                            System.out.println("duplicate data is : "+trm[0]);;
                            employeeMap.put(trm[0],(employeeMap.get(trm[0])+1));
                        }else{
                            employeeMap.put(trm[0], 1);
                        }
                    }

                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }

            }
        }
