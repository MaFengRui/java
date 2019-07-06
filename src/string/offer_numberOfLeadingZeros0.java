package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-2
 * Time:下午4:17
 * Vision:1.1
 * Description:二进制高位连续0的个数
 */
public class offer_numberOfLeadingZeros0 {
    public static int Solution(int i){
        if(i == 0)
            return 32;
        int n = 0;
        int mask = 0x80000000;//mask=10000000三十二个0
        int j = i & mask;
        while (j==0){
            n++;
            i <<=1;
            j=i&mask;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Solution(5));
    }


}

