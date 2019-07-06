package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:上午10:42
 * Vision:1.1
 * Description:例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class offer_LeftRotateString {
    public static String Solution(String str,int n){
        if (str.length()<n || str.length()==0 || str==""){
            return "";
        }
        String str1 = str.substring(0, n);
        String str2 = str.substring(n);
        return str2+str1;
    }

    public static void main(String[] args) {
        System.out.println(Solution("abcdfe",2));

    }
}
