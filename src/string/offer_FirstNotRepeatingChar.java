package string;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-2
 * Time:下午4:45
 * Vision:1.1
 * Description:第一个只出现一次的字符
 */
public class offer_FirstNotRepeatingChar {
    public static int Solution(String str){
        int res = -1;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for (int i = 0; i < str.length() ; i++) {
            if (map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(Solution("aabcb"));
    }

}
