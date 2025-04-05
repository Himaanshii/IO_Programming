package CSV_Data_Handling.Advanced;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadLargeCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path of the file");
        String path = sc.nextLine();
        int batchSize = 100;
        int totalRecords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int batchCount = 0;

            while ((line = reader.readLine()) != null) {
                batchCount++;
                totalRecords++;

                if (batchCount == batchSize) {
                    System.out.println("Processed " + totalRecords + " records ");
                    batchCount = 0;
                }
            }


            if (batchCount > 0) {
                System.out.println("Processed " + totalRecords + " records in total.");
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    }

