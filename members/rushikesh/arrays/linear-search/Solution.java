import java.util.Scanner;

public class Solution {
    
    int arr[] = {5, 8, 2, 9,12,75};
    int num;
    boolean isfound ;
    int index ;


Solution(){
        isfound = false; 
        index =-1;
    }

   void find(int f){
int i=0; 
while (i<arr.length && isfound==false) {
    if(arr[i]==f) {
        index = i;
        isfound = true;
      
} 
i++;

 }}
    
   


    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number");
        s.num = sc.nextInt();
        s.find(s.num);

        if(s.isfound){
            System.out.println("Element is found at index "+s.index );
        }else{
            System.out.println("Number is not present in the array");
        }
        
    }
    

}