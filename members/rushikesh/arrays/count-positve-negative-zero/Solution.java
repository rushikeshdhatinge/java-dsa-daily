public class Solution {

    int arr[] = {2,4,0,7,9,-5,-3};
    int P,N,Z;

    Solution(){
        P=N=Z=0;
    }

    void find(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) P++;
            if(arr[i]<0) N++;
            if(arr[i]==0) Z++;

        }

        System.out.println("Positive Numbers are "+P);
        System.out.println("Negative Numbers are "+N);
        System.out.println("Zeros are "+Z);


    }



   public static void main(String[] args) {
    Solution s = new Solution();
    s.find();
   }
    

}