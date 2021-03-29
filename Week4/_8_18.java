
public class _8_18 {
	
    public static void main(String args[]){
    	// TODO Auto-generated method stub
        int[][] m = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        shuffle(m);
        for(int i = 0; i < m.length; ++i)
        {
            for(int j = 0; j < m[i].length; ++j)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m){
        for(int i = 0; i < m.length; ++i){
            for(int j = 0; j < m[0].length; ++j)
            {
                int n = (int)(Math.random()*m[0].length);
                
                int temp = m[i][n];
                m[i][n] = m[i][j];
                m[i][j] = temp;
            }
            
            int q = (int)(Math.random() * m.length);
            
            int[] temp1 = m[q];
            m[q] = m[i];
            m[i] = temp1;
        }
    }
}