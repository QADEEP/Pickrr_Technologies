package pages.JavaPractice;

import java.util.Map;
import java.util.TreeMap;

public class WordCountVowelcount {
    public static void main(String[] args) {
        String str="My Name Is Deep Chand.";
        WordCountVowelcount w=new WordCountVowelcount();
        w.getwordvowelCount(str);
        w.getfrequency(str);
    }
    private void getfrequency(String str) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i < str.length();i++){
            Integer c= map.get(str.charAt(i));
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),++c);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println("Character : "+entry.getKey());
            System.out.println("Count : "+entry.getValue());
        }
    }

    private void getwordvowelCount(String str) {
        int wordCount=0; int vowelCount=0;int upperCaseCount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            switch (c){
                case ' ':
                case '.':
                    wordCount++;
            }
                switch (c) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount++;
                }
                    if(c>=65 && c<=90){
                        upperCaseCount++;
                    }
            }
        System.out.println("word count is :" +wordCount);
        System.out.println("vowel count is :" +vowelCount);
        System.out.println("upper case count is :" +upperCaseCount);
        }

    }


