package linklist;

import java.util.Stack;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-26
 * Time:上午8:04
 * Vision:1.1
 * Description:创建一个单链表
 */
public class offer_SingLinkList_5 {
    public offer_SingNode head;
    public int length;
//我之前一直纠结在这个头节点初始值怎么弄，看了一些博客后我，觉得我们没必要管
// 就让添加数据的时候进行判断如果头节点为空，就把要插入的节点添加进去
// 初始化
// ①增加结点
// ②删除节点
// ③正向遍历链表
// ④反向遍历链表
// ⑤判断是否有环


    //初始化
    public offer_SingLinkList_5() {
        this.head = null;
        this.length = 0;
    }


    //①增加节点
    public void addNode(int data){
        offer_SingNode newNode = new offer_SingNode(data);
        if (head == null){
            head = newNode;
            length++;
            return;
        }
        //head不为空
        offer_SingNode tmpNode = head;

        while (tmpNode.nextNode != null) {
            tmpNode = tmpNode.nextNode;
        }

        tmpNode.nextNode = newNode;
        length ++;
        }
    //②删除节点
    public void deleteNode(int data){
        if (head == null || length == 0){
            System.out.println("该单链表为空无法删除");
            return;
        }else {

            if (head.value == data){
                System.out.println("正好删除了头结点");
                head = head.nextNode;
                length--;
                return;
            }
            //我们需要一个前节点，和一个当前节点
            offer_SingNode proNode = head;
            offer_SingNode curr = proNode.nextNode;
            while (curr != null){
                if (curr.value == data){
                    proNode.nextNode = curr.nextNode;
                    System.out.println("删除成功");
                    length--;
                    return;
                }
                 proNode = curr;
                 curr = curr.nextNode;
            }
                System.out.println("该数据不存在这个链表中");
        }

    }
//③正向遍历节点
    public void travlLinkList(){
    if (length == 0){
        System.out.println("该了链表为空，么有数据");
    }else {
        offer_SingNode temp = head;

        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.nextNode;
            }
        }
    }
//④反向遍历链表
    //方法一。使用实现
    public  void reversalTravlLinkList(){
        //需要栈实现先进后出比较合适
        Stack objects = new Stack<>();
        if (length == 0){
            System.out.println("该了链表为空，么有数据");
            return;
        }else {
            offer_SingNode temp = head;

            while (temp != null){
              objects.push(temp.value);
              temp = temp.nextNode;
            }
        }
        while (!objects.empty()){
            System.out.println(objects.pop()+"->");
        }
    }
    //方法二 递归实现
    public  void rerverTravl(offer_SingNode offer_singNode){
        if (offer_singNode == null){
            return;
        }else {
            rerverTravl(offer_singNode.nextNode);
            System.out.println(offer_singNode.value);
        }
    }
// ⑤判断是否有环
    public boolean isloop(){
        if (head == null|| length == 0){
            return false;
        }else {
            offer_SingNode fast = head;
            offer_SingNode slow = head;
            while (fast.nextNode != null && slow.nextNode.nextNode != null){

                fast=fast.nextNode;
                slow =slow.nextNode.nextNode;
                if (fast == slow){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        offer_SingLinkList_5 linkList = new offer_SingLinkList_5();
        linkList.addNode(1);
        linkList.addNode(2);
        linkList.addNode(3);
        linkList.addNode(4);
        linkList.addNode(5);
        System.out.println("长度");
        System.out.println(linkList.length);
        linkList.travlLinkList();
        linkList.rerverTravl(linkList.head);
        linkList.deleteNode(2);
        System.out.println(linkList.isloop());
    }


}
