package Day18;

public class checkPalindrome {
    boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    boolean checkPalindrome2(String s){
        StringBuffer sb = new StringBuffer(s);
        sb = sb.reverse();
        return sb.toString().equals(s);
    }
    public static void main(String[] args) {
        
    }
}
