package string;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-25
 * Time:上午7:53
 * Vision:1.1
 * Description:字符的替换，精髓：从前往后会有很多空格重复被后移，所以从后往前移可以增加效率
 */
public class offer_string_4 {

    public static void Solution(char[] c, int length){

        // 查询空格的个数
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        // 重新计算新数组的大小
        int newLength = length + count * 2;
        // 从尾到头查找
        int i = length - 1;
        int j = newLength - 1;
        while (i >= 0 && j >= i) {
            if (c[i] == ' ') {
                c[j--] = '0';
                c[j--] = '2';
                c[j--] = '%';
            } else {
                c[j--] = c[i];
            }
            i--;
        }
        String s = String.valueOf(c);
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] chars = new char[100];
        chars[0] = 'a';
        chars[1] = ' ';
        chars[2] = 'b';
        int length = 3;
        Solution(chars,length);
    }





}
