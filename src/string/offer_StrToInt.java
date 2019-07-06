package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:上午11:20
 * Vision:1.1
 * Description:将字符转换为整数
 */
public class offer_StrToInt {
    public static int Solution(String str){
        if (str.length()==0 || str=="" || str==null){
            return 0;
        }
        char[] chars = str.toCharArray();
        int mark = 0;
        int res=0;
        if (chars[0]=='-'){
            mark=1;
        }
        for (int i = mark; i <chars.length ; i++) {
            if (chars[i]=='+') continue;
            if (chars[i] <=48 || chars[i]>57){
                return 0;
            }else {
                res=res*10+chars[i]-48;
            }
        }
        return  mark==0?res:-res;

    }
}

