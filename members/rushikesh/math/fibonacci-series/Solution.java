import java.util.Scanner;
class Solution {
 int N;



Solution(){
N = 10;
}

void Fibonacci(){

        System.out.print("0 1");
        int before1 = 1;int before2 =  0; 
        int temp,Curr;
    for(int i=1;i<=N-2;i++){
 

  Curr = before1 + before2;
  System.out.print(" "+Curr); 
  temp = before1;
  before1 = Curr;
  before2 = temp;



     }
}

public static void main(String[] args) {
    
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number");
        s.N = sc.nextInt();
        
        s.Fibonacci();
}



}