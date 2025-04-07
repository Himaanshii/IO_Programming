package Practice_Problems.ValidateJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class validatejson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try{
            String filePath = "C:\\Users\\Himanshi\\Documents\\input.txt";
            File jsonFile = new File(filePath);
            Object json = mapper.readValue(jsonFile,Object.class);
            System.out.println("this is valid Json file");

        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
