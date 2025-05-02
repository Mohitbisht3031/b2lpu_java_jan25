package Day40;

public arrayR {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int narr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            narr[((i+1)%arr.length)] = arr[i];
        }
        
    }
}
