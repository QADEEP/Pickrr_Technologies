package apiPayloads;

import apiRequest.DemoblazeAddToCartRequest;

import java.util.*;

public class DemoblazeAddToCartPayload {
    static DemoblazeAddToCartRequest demoblazeAddToCartRequest;
    public static DemoblazeAddToCartRequest setBody(){
        demoblazeAddToCartRequest=new DemoblazeAddToCartRequest();
        demoblazeAddToCartRequest.setId("d1a62622-ae59-9c6b-32cd-4c6e5e52dbdc");
        demoblazeAddToCartRequest.setCookie("user=dee2b6b4-37c3-0f18-edaa-43ccd68c0817");
        demoblazeAddToCartRequest.setProductID(1);
        demoblazeAddToCartRequest.setFlag(false);
        return demoblazeAddToCartRequest;
    }

//    public static void main(String[] args) {
//        int[] A={0,1,1,1,1,1,0,0,0,0,0};
//        List<Integer> list=new ArrayList<>();
//        for(int i : A){
//            list.add(i);
//        }
//        System.out.println(Collections.frequency(list,0));
//        System.out.println(Collections.frequency(list, 1));
//    }

    public static void main(String[] args) {
        int [] a={1,0,1,0,0,0,0,1};
        Map<Integer, Integer> map=new HashMap<>();
        for(int i:a){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }























}
