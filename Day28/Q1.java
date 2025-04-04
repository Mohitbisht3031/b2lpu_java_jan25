package Day28;

public class Q1 {
    // O(n^3)
    int maxOfTriple(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    int ans = (arr[i]-arr[j])*arr[k];
                    maxi = Math.max(maxi, ans);
                }
            }
        }

        return (maxi < 0 ? 0 : maxi);
    }

    int maxOfTriple2(int arr[]){
        int pre[] = new int[arr.length];
        int suf[] = new int[arr.length];
        
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = Math.max(arr[i],pre[i-1]);
        }
        suf[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            suf[i] = Math.max(arr[i],suf[i+1]);
        }

        int maxi = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length-2;i++){
            maxi = Math.max(((pre[i-1]-arr[i])*suf[i+1]),maxi);
        }

        return maxi < 0 ? 0 : maxi;
    }

}
