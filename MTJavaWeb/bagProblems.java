import java.util.Arrays;

public class bagProblems{
    public static void main(String[] args) {
        // 物品重量
        int[] weights = new int[]{1, 3, 5};
        //物品价值
        int[] val = new int[]{250, 300, 500};
        //重量上限
        int weightCap = 5;
        //行数  物品的个数
        int n = weights.length;
        int[][] v = new int[n + 1][weightCap + 1];
        int[][] path = new int[n + 1][weightCap + 1];

        //初始化第一行 第一列
        for (int i = 0; i < v.length; i++){
            v[i][0] = 0;//第一列全部设置为0
        }
        for (int j = 0; j < v[0].length; j++){
            v[0][j] = 0;//第一行全部设置为0
        }

        for (int i = 1; i < v.length;i++){//不处理第一行
            for (int j = 1; j < v[0].length; j++){//不处理第一列
                if (weights[i - 1] > j){
                    v[i][j] = v[i-1][j];
                } else if (weights[i - 1] <= j) {
                    //v[i][j] = Math.max(v[i -1][j], val[i-1] + v[i - 1][j - weights[i-1]]);
                    if (v[i -1][j] < val[i-1] + v[i - 1][j - weights[i-1]]){
                        v[i][j] = val[i-1] + v[i - 1][j - weights[i-1]];
                        path[i][j] = 1;
                    }else{
                        v[i][j] = v[i -1][j];
                        path[i][j] = 0;

                    }

                }
            }

        }
        //打印 v
        for (int i = 0;i < v.length; i++){
            for (int j = 0; j < v[0].length;j++){
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================================");

        //打印path
        for (int i = 0;i < v.length; i++){
            for (int j = 0; j < path[0].length;j++){
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================================");

        int i = path.length - 1;
        int j = path[0].length - 1;
        while (i > 0 && j > 0){
            if (path[i][j] == 1) {
                System.out.println("第" + i + "个商品放入背包");
                j -= weights[i - 1];
            }
            i--;
        }





    }

}