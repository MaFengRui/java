package stack;

import java.util.Stack;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:19-7-3
 * Time:下午5:59
 * Vision:1.1
 * Description:实现栈中最小函数
 */
public class offer_stackMinNumber {

    /*
     * 思路：用一个栈stack保存数据，用另外一个栈min保存依次入栈最小的数
     * 比如，stack中依次入栈，5, 4, 3, 8, 10,11,12,1
     * 则min依次入栈，5, 4, 3, 3, 3, 3, 3, 1
     * 每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则入stack的栈顶元素。
     * 保持stack中和min中保持相同个数的元素 ，同时保持min的栈顶是此时原栈的最小值。
     */
    Stack<Integer> stackData = new Stack<>(); //声明时候的异同
    Stack<Integer> stackMin = new Stack<Integer>();
    public void push(int node) {
        stackData.push(node);
        // 如果min为空或者node比min栈中的元素小，则入min栈
        if(stackMin.size() == 0 || stackMin.peek() > node)
            stackMin.push(node);
        else // 否则把min栈中的顶部元素重复入栈
            stackMin.push(stackMin.peek());
    }

    public void pop() {//因为时刻保持两个栈的高度相同，所以两个都pop，时刻保持min的栈顶是原栈的最小值。
        //如果返回应该是返回原栈的。
        if(!stackData.isEmpty()){
            stackData.pop();
            stackMin.pop();
        }
    }

    public int top() {
        return stackData.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
