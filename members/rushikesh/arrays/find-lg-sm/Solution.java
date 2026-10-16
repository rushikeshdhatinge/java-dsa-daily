public class Solution {

    int sm,lg;
    int arr[] = {2,4,0,7,9};

 Solution(){
    sm = Integer.MAX_VALUE;
    lg = Integer.MIN_VALUE;
 }

 void find(){
    for(int i=0;i<arr.length;i++){
        if(arr[i]>lg) lg = arr[i];
        if(arr[i]<sm) sm = arr[i];

        
    }
 }

   public static void main(String[] args) {
    Solution s = new Solution();
    s.find();
    System.out.println("Largest element is "+s.lg);
    System.out.println("Smallest element "+s.sm);
   }
    

}