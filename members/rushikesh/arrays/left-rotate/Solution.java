public class Solution {
    int arr[] = {1,2,3,4,5};
    int l;
    int temp;
  Solution(){
 l = arr.length-1;
  }

  void rotate(){
 for(int i=0;i<l;i++){
  int j=i+1;
  temp = arr[j];
  arr[j] = arr[i];
  arr[i] = temp;

 }
  }

   void print()  {
         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
         }
  }
  
    public static void main(String[] args) {
        Solution s = new Solution();
        s.rotate();
        s.print();
        
    }
    

}