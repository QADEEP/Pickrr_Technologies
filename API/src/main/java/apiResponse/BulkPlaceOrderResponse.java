package apiResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class BulkPlaceOrderResponse {
    String err;

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();
        JSONArray jsonArray=new JSONArray();
        jsonArray.put("hindi");
        jsonArray.put("English");
        jsonArray.put("Math");
        jsonArray.put("SS");
        jsonObject.put("name","deep");
        jsonObject.put("name","loki");
        jsonObject.put("roll",567);
        jsonObject.put("age",34);
       jsonObject.put("subject",jsonArray);

        System.out.println(jsonArray);
        System.out.println(jsonObject);

    }
}
