package Day18;

import java.util.Arrays;

public class checkAnagram {
    boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length())return false;
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != arr2[i])return false;
        }
        return true;
    }
    boolean checkAnagram2(String s1,String s2){
        if(s1.length() != s2.length())return false;
        int arr[] = new int[26];
        for(int i = 0;i<s1.length();i++){
            int ind = (int)s1.charAt(i);
            arr[(ind - (int)'a')]++;
        }
        for(int i = 0;i<s1.length();i++){
            int ind = (int)s2.charAt(i);
            arr[(ind - (int)'a')]--;
        }
        for(int i = 0;i<26;i++){
            if(arr[i] > 0 || arr[i] < 0)return false;
        }
        return true;
    }
}
