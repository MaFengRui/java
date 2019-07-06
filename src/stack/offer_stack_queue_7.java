package stack;

import java.util.Stack;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-28
 * Time:下午4:48
 * Vision:1.1
 * Description:用两个栈实现队列，并且能在队列的头部删除，尾部添加
 */
public class offer_stack_queue_7 {
    static  Stack<Integer> stack1;
    static  Stack<Integer> stack2;

    public offer_stack_queue_7() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //增加数据
    public static void addData(int data){
        stack1.push(data);
    }
    //删除数据
    public static void deleteData(){
        if (!stack2.empty()){
            Integer pop = stack2.pop();
            System.out.println("删除数据"+pop);
        }else if (stack2.empty()){
            if (stack1.empty()){
                System.out.println("队列中没有数据可删除");
            }else {
                while (!stack1.empty()){
                    stack2.push(stack1.pop());
                }
                Integer pop = stack2.pop();
                System.out.println("删除数据"+pop);
            }
        }
    }

    public static void main(String[] args) {
        offer_stack_queue_7 stack_queue = new offer_stack_queue_7();
        stack_queue.deleteData();
        stack_queue.addData(3);
        stack_queue.deleteData();
    }



}
