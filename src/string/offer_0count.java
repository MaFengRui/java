package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-2
 * Time:下午4:04
 * Vision:1.1
 * Description:判断二进制中0的个数
 */
public class offer_0count {
    public static int Solution(int n){

        int count = 0;

        while(n != 0) {
            if((n&1)!=1)
                count++;
            n>>>=1;
        }
        return count;
    }

}
