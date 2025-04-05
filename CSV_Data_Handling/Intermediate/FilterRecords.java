package CSV_Data_Handling.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FilterRecords {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
                try (BufferedReader re = new BufferedReader(new FileReader(path))) {
                    String line;
                    while ((line = re.readLine()) != null) {
                        String[] col = line.split("\\\\s+");
                        try {
                            int t = Integer.parseInt(col[0]);

                            if (t > 80) {
                                System.out.println(col[0]);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number format in line: " + line);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }

