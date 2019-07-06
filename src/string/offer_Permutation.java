package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:下午2:40
 * Vision:1.1
 * Description:输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class offer_Permutation {
    public static ArrayList<String> Solution(String str){
        if ( str == null ) {
            return null;
        }
            ArrayList<String> res = new ArrayList<>();
            char[] chars = str.toCharArray();
            Permutation(chars,0,res);
        Collections.sort(res);
        return res;

    }

    public static void Permutation(char[] chars, int i, ArrayList<String> res) {

        if (i==chars.length-1){
            if (!res.contains(String.valueOf(chars))){
                res.add(String.valueOf(chars));
            }

            }
        else {
            for (int j = i; j <chars.length ; j++) {
                swap(chars,i,j);
                Permutation(chars,i+1,res);
                swap(chars,i,j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    public static void main(String[] args) {
        ArrayList<String> abc = Solution("aa");
        Iterator<String> iterator = abc.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
