package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-6-19
 * Time:上午9:45
 * Vision:1.1
 * Description:创建一个arraylist并且进行反向输出
 */
public class reversePrint {

        public static void sloution(List<String> x){
            int len = x.size();
            for (int i =len-1; i >= 0 ; i--) {
                System.out.println(x.get(i));

            }
        }

    public static void main(String[] args) {
        List test = new ArrayList<String>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        sloution(test);
    }


}
