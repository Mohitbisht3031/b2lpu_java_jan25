package Day36;

public palindrome{
    boolean checkPalin(Stirng num){
        if(num.length() == 1)return true;
        int i =0;
        int j = num.length()-1;
        while(i <= j){
            if(num.charAt(i) != num.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String args[]){

    }
}