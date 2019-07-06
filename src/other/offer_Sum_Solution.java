package other;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:下午7:21
 * Vision:1.1
 * Description:求1+2+3+4+n 要求不能使用控制语句，以及条件判断语句
 * 思路：使用递归进行求解，使用短路进行求解，左边控制Ｎ的大小，当Ｎ的值小于０时
 * 不执行短路的右边，直接返回结果
 */
public class offer_Sum_Solution {
    public static int  Solution(int n){
        int temp=0;
        int res=0;
        boolean flag=((n>0) && temp==(res = Solution(n-1)));
        res=res+n;
        return  res;
    }

}
