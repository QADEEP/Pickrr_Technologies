package API.FreshWork;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class WorkflowAutomation {

    public static void main(String[] args) {
        int num=7,result;
        result=factorial(num);
        System.out.println("Factorial of " +num +" is " +result);
        String str1="raced";
        String str2="cared";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length() !=str2.length()){
            System.out.println("strings are not anagram");
        }else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            Arrays.equals(charArray1,charArray2);
            System.out.println("Strings are anagram");
        }
    }

    public static int factorial(int n){
        if(n!=0){
            return n * factorial(n-1);
        }else{
            return 1;
        }
    }
}
