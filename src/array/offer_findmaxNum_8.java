package array;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-28
 * Time:下午5:46
 * Vision:1.1
 * Description:输入一个旋转有序数组，求出最小值 exp：456123 ,minNum:1 在o(n)完成
 */
public class offer_findmaxNum_8 {
    public static int  solution(int[] arry){
        if (arry.length == 0 && arry == null){
            System.out.println("数组为空或者数组长度为0");
            return -1;
        }
        //分三种情况考虑
        //①end <= start
        //②end > start  尾部从头遍历，直到遇见比他大的
        if (arry[0] <  arry[arry.length-1]){
            System.out.println("min:"+arry[0]);
        }else {
            for (int i = arry.length-1; i >= 1 ; i--) {
                if (arry[i] < arry[i-1]){
                    System.out.println("min；"+arry[i]);
                    return arry[i];
                }
            }
        }
        System.out.println(arry[0]);
        return arry[0];

    }

    public static void main(String[] args) {
         int[] a = {2,3,4,5,6,1,2};
         solution(a);
    }
}
