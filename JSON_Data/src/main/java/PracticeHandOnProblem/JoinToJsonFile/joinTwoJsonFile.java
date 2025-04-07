package PracticeHandOnProblem.JoinToJsonFile;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class joinTwoJsonFile {
    public static void main(String[] args) throws Exception{
        String path1 = new String(Files.readAllBytes(Paths.get("D:\\Capgemini\\Week5\\src\\JSON_Data\\src\\main\\java\\PracticeHandOnProblem\\FilterJSON\\Data.json")));
        String path2 = new String(Files.readAllBytes(Paths.get("D:\\Capgemini\\Week5\\src\\JSON_Data\\src\\main\\java\\Practice_Problems\\ReadJsonFile\\data.json")));


        JSONObject obj1 = new JSONObject(path1);
        JSONObject obj2 = new JSONObject(path2);


        for (String key : obj2.keySet()) {
            obj1.put(key, obj2.get(key));
        }

        // Rahul Patel
        System.out.println("Merged JSON:\n" + obj1.toString(2));
    }
}
