package dynamicProgramming;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-6-19
 * Time:下午1:34
 * Vision:1.1
 * Description:fibonacci的动态规划法的具体实现
 * 算法：自顶向下的备忘录法
 * 算法思想：就是将每个递归函数的值存放在一个数组中，当我们进行递归的时候直接查看是否计算
 * 过这个值
 * 缺点：依旧回去迭代fib（n），备忘录方法只是将结果保存下来
 *
 * 算法：自底向上的动态规划法
 * 算法思想：要计算的函数提前保存下来
 *
 */
public class Fibonacci {
    //备忘录方法（自顶向下）
    public static  int solution(int n){
        if(n<0){
            return 0;
        }
        int[] meno = new int[n + 1];
        for (int i = 0; i <meno.length ; i++) {
            meno[i]=-1;
        }

        return  solution(n,meno);

    }
    //备忘录方法（自顶向下）
    public static  int solution(int n,int[] meno){
        if (meno[n] != -1){
            return meno[n];
        }
        ///如果已经求出了fib（n）的值直接返回，否则将求出的值保存在Memo备忘录中。
        if(n<=2)
            meno[n]=1;

        else meno[n]=solution( n-1,meno)+solution(n-2,meno);
        return meno[n];
    }
    //自顶向上,不使用递归进行计算
    public static int solutionA(int n){
        if (n<=0){
            return 0;
        }
        if (n<2){
            return 1;
        }
        int[] memo = new int[n + 1];
        memo[0]=0;
        memo[1]=1;
        for (int i = 2; i <=n ; i++) {
             memo[i]= memo[i - 1] + memo[i - 2];
        }
        return memo[n];

    }
    //改进自底向上的方法，不使用额外空间
    public static int fib(int n)
    {
        if(n<=1)
            return n;

        int Memo_i_2=0;
        int Memo_i_1=1;
        int Memo_i=1;
        for(int i=2;i<=n;i++)
        {
            Memo_i=Memo_i_2+Memo_i_1;
            Memo_i_2=Memo_i_1;
            Memo_i_1=Memo_i;
        }
        return Memo_i;
    }

    public static  int FindGreatestSumOfSubArray(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            sum = Math.max(sum + array[i], array[i]);
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] ints = {1,2,1,-3, 4, 5, 6};
        System.out.println(FindGreatestSumOfSubArray(ints));
    }



}
