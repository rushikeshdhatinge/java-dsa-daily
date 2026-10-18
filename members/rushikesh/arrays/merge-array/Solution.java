public class Solution {

  int arr1[]  = {1,2,3,4,5};

  int arr2[]  = {6,7,8,9};
  int l = arr1.length +arr2.length;
  int arr3[] = new int[l];

  void merge(){
    for(int i=0;i<l;i++){
      if(i<arr1.length) arr3[i] = arr1[i] ;
      else arr3[i] = arr2[i-arr1.length];
    }
  }

  void print()  {
         for(int i=0;i<arr3.length;i++){
            System.out.print(" "+arr3[i]);
         }
  }

  
    public static void main(String[] args) {
        Solution s = new Solution();
        s.merge();
        s.print();
        
    }
    

}