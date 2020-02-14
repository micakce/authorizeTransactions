import org.json.*;
import java.util.*;

public class Input {
    // private String input;
    Scanner scan = new Scanner(System.in);
    JSONObject obj = new JSONObject(scan);
    //JSONObject obj2 = obj.getJSONObject("account");
    //String saldo = obj2.getString("availableLimit");

    public void test(){
        System.out.println(obj);
    }

    public static void main(String[], args){
        test();
    }
}
