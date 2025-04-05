package CSV_Data_Handling.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortCSVFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
                try (BufferedReader re = new BufferedReader(new FileReader(path))) {
                    String line;

                    Map<String, Integer> employeeMap = new HashMap<>();
                    while ((line = re.readLine()) != null) {
                        String[] trm = line.split(" ");
                        for(String tr : trm){
                            int secn = Integer.parseInt(trm[1]);
                            employeeMap.put(trm[0],secn);
                        }
                    }

                    List<Map.Entry<String, Integer>> list = new ArrayList<>(employeeMap.entrySet());
                    list.sort(Map.Entry.comparingByValue());
                    list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }

