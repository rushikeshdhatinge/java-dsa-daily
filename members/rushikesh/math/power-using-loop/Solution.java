import java.util.*;
public class Solution {
int Num,Power;
int Result = 1;



void Process(){

  for(int i=0;i<Power;i++){

  Result *= Num;
  }

    System.out.print(Result);
}


    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        s.Num = sc.nextInt();
        System.out.println("Enter your Power");
        s.Power = sc.nextInt();
        s.Process();
    }
    

}