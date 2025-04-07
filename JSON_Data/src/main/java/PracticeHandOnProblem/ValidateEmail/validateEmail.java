package PracticeHandOnProblem.ValidateEmail;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class validateEmail {
    public static void main(String[] args) throws  Exception {
        String path = new String(Files.readAllBytes(Paths.get("D:\\Capgemini\\Week5\\src\\JSON_Data\\src\\main\\java\\PracticeHandOnProblem\\FilterJSON\\Data.json")));

        JSONObject obj = new JSONObject(path);

        boolean flag = false;
        for(String key : obj.keySet()){
            if(obj.get(key).toString().equals("himanshi@example.com")){
                System.out.println("mail is present");
                flag = true;
                break;
            }

        }

        if(flag==false){
            System.out.println("email not present");
        }
    }
}
