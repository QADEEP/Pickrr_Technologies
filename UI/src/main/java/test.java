import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int [] a={0,1,1,1,1,0,0,0};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:a){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }else {
            map.put(i,1);
        }
        }
       for(Map.Entry entry: map.entrySet());
    }

}
