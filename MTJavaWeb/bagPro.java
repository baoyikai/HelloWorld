import java.util.Arrays;
public class bagPro{
    public static void main(String[] args){
        int[] weights = new int[]{1,3,5};
        int[] val = new int[]{250,300,500};
        int bagCap = 5;
        int[][] v = new int[weights.length + 1][bagCap + 1];
        int[][] path = new int[weights.length + 1][bagCap + 1];

        for (int i = 0; i < v.length; i++){
            v[i][0] = 0;
        }
        Arrays.fill(v[0], 0);

        for (int i = 1; i < v.length; i++){
            for (int j = 1; j < v[0].length; j++){
                if (weights[i - 1] > j){
                    v[i][j] = v[i - 1][j];
                }else if(weights[i - 1] <= j){
//                    v[i][j] = Math.max(v[i-1][j], val[i-1] + v[i - 1][j - weights[i - 1]]);
                    if(v[i - 1][j] < val[i - 1] + v[i - 1][j - weights[i - 1]]){
                        v[i][j] = val[i - 1] + v[i - 1][j - weights[i -1]];
                        path[i][j] = 1;

                    }else{
                        v[i][j] = v[i - 1][j];
                        path[i][j] = 0;
                    }
                }
            }
        }

        int i = path.length - 1;
        int j = path[0].length - 1;
        while(i > 0 && j > 0){
            if (path[i][j] == 1){
                System.out.println("第" + i + "个商品放入背包");
                j -= weights[i - 1];
            }
            i--;
        }


    }
}