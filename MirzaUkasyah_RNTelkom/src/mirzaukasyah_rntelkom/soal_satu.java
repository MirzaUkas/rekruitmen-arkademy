package mirzaukasyah_rntelkom;
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;
/**
 *
 * @author MirzaUY
 */


public class soal_satu {
    
    public static void main(String[] args) {
        returnJSON();
    }
    static void returnJSON(){
        JSONObject mainObject = new JSONObject();
        mainObject.put("itemId","12341822");
        mainObject.put("itemName","Basic T-shirt");
        mainObject.put("price",70000);
        JSONArray availArr = new JSONArray();
        JSONObject obj1 = new JSONObject();
        obj1.put("color","red");
        obj1.put("size","S,M,L");
        JSONObject obj2 = new JSONObject();
        obj2.put("color","solid black");
        obj2.put("size","M,L");
        availArr.add(obj1);
        availArr.add(obj2);
        mainObject.put("availableColorAndSize",availArr);
        mainObject.put("freeShiping",false);
        System.out.print(mainObject);
    }
}
