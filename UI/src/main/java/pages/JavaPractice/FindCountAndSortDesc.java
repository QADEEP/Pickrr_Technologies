package pages.JavaPractice;

import java.util.*;

public class FindCountAndSortDesc {
    public static void main(String[] args) {
        // find the frequency of the character and sort desc
        String str="banana";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            Integer value=map.get(c);
            if(value!=null){
            map.put(c,new Integer(value+1));
            }else{
            map.put(c,1);
            }
        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character,Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Character,Integer> entry:list){
            System.out.println(entry.getKey()+ "" + entry.getValue());
        }
        }
    }

