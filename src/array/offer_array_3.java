package array;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-24
 * Time:上午10:16
 * Vision:1.1
 * Description:在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class offer_array_3 {

    public static boolean  Solution(int[][] a ,int x){
        if (a.length == 0){
            return false;
        }
        int column = a[0].length-1;
        int row = a.length-1;
        for (int i = column; i >=0 ; i--) {

            for (int j = 0;j < row;j++){
                int temp = a[j][i];
                if (temp == x){
                    return  true;
                }else if (temp > x){
                    continue; //减掉一行

                }else {
                    //减掉一列
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int [][] ints = new int[][]{};
        boolean solution = Solution(ints, 2);
        System.out.println(solution);
    }



}
