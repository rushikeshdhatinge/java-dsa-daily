public class Solution {
       
       int arr[] = {1,2,3,4,5,6};
       int i,j;
  Solution(){
     i =0;
     j=arr.length-1;
  }
  void reverse(){
    int temp;
    while (i<j) {
      temp = arr[i] ;
      arr[i] = arr[j] ;
      arr[j] = temp;
      i++;
      j--;
    }

 
  } 
  
  
  void print()  {
         for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
         }
  }


    public static void main(String[] args) {
        Solution s = new Solution();
         s.reverse();
         s.print();
    }
    

}