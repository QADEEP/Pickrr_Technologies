package UI.Dummy;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    char[] a="deep".toCharArray();
    char[] b="peed".toCharArray();
    if(anagram(a,b)){
        System.out.println("2 strings are anagram");
    }else {
        System.out.println("Strings are not anagram");
    }
    }
    public static boolean anagram(char[] a, char[]b){
     int s1=a.length;
     int s2=b.length;
     if(s1!=s2)
         return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<s1; i++){
            if(a[i]!=b[i]){
                return false;

            }
        }
        return true;

    }
}
