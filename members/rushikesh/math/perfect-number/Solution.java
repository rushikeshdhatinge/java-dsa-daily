import java.util.Scanner;

public class Solution {

 int num,sum;
 boolean isPerfect;
    
Solution(){

    sum=0;
    isPerfect = false;
}



boolean Process(){

    for(int i=1;i<num;i++){
        if(num%i==0){
            sum +=i ;
        }
    }

    if(sum==num) return true;
    else return  false;
    
    
}



public static void main(String[] args) {
    Solution s = new Solution();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number");
    s.num = sc.nextInt();
    

    if(s.Process()){
        System.out.println("Number is perfect  " );
    }else {
        System.out.println("Not Perfect Number ");
    }

}

}