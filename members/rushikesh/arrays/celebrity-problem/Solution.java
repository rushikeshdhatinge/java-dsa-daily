public class Solution {

int[][] matrix = {
    {1,0,1},
    {0,1,1},
    {0,0,0}
} ;
int row = matrix.length;
int col = matrix[0].length;
boolean isC[] = new boolean[row];
    
void findC(){
     for(int i=0;i<row;i++){
         isC[i] = true;


         for(int j=0;j<col;j++){
           if(matrix[i][j] == 1 && i!=j){ isC[i] = false; break;} 
        }

        if(isC[i]==true){
            for(int j=0;j<row;j++){
              if(matrix[j][i]==0 && i!=j) { isC[i] = false; break;} 
            }


       for(boolean c :isC){System.out.print(c+" ");}


     }

    
     }
     
}

public static void main(String[] args) {
    Solution s = new Solution();
    s.findC();
}

}