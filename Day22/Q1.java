package Day22;

import java.lang.classfile.instruction.ConstantInstruction.IntrinsicConstantInstruction;
import java.util.ArrayList;

public class Q1 {
    int returnSingle(ArrayList<Integer>arr,int n){
        for(int i = 0;i<arr.size();i++){
            boolean f = true;
            for(int j= 0;j<arr.size();j++){
                if(i!=j && arr.get(j) == arr.get(i)){
                    f = false;
                    break;
                }
            }
            if(f)return arr.get(i);
        }
        return -1;
    }

    int returnSingle2(ArrayList<Integer>arr,int n){
        int ar[] = new int[n+1];
        for(int i = 0 ;i<arr.size();i++){
            ar[arr.get(i)]++;
        }
        for(int i = 0;i<ar.length;i++){
            if(ar[i] == 1)return ar[i];
        }
        return -1;
    }
    int returnSingle3(ArrayList<Integer>arr,int n){
        int ans =0 ;
        for(int i = 0;i<arr.size();i++){
            ans^=arr.get(i);
        }
        return ans;
    }
}
