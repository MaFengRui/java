package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-2
 * Time:下午3:35
 * Vision:1.1
 * Description:输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class offer_1count {
    public static int Solution(int a){
       //方法一：将a无符号右移一位，在于1 &
//        int res = 0;
//        while (a!=0){
//            res = res + a&1;
//            a=a>>>1;
//        }
//        return res;

        //方法二:n&(n-1)
        int count = 0;
        while (a!=0){
            System.out.println(a);
            a=a&(a-1);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(Solution(7));
    }


}
