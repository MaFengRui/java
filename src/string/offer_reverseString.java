package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:上午10:16
 * Vision:1.1
 * Description:翻转字符串
 输入：I LOVE YOU
 输出：YOU LＯＶＥ　ＹＯＵ

 */
public class offer_reverseString {
    //思路一:按照空格进行切割
    public  static String Solution1(String str){
        if (str.length()==0 || str=="" || str == null){
            return "";
        }
        String[] split = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = split.length-1;i>=0;i--) {

            if (i==0){
                stringBuffer.append(split[i]);
            }else {
                stringBuffer.append(split[i]+" ");
            }
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        System.out.println(Solution1("I LOVE YOU"));
    }

}
