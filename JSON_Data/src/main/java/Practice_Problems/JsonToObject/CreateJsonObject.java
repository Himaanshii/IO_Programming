package Practice_Problems.JsonToObject;
import org.json.JSONObject;
public class CreateJsonObject {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name","Himanshi");
        obj.put("age","25");
        obj.put("email","xyz@gmail.com");

        System.out.println(obj.toString());

    }
}
