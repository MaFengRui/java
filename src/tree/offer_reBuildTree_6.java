package tree;

import javax.swing.tree.TreeNode;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-28
 * Time:上午8:16
 * Vision:1.1
 * Description:根据前序序列1 2 4 7 3 5 6 8，中序遍历4 7 2 1 5 3 8 6
 * 重新构建这个二叉树
 */
public class offer_reBuildTree_6 {
    public static  treeNode solution(int[] pro,int[] in) {//
        if (pro.length != in.length || pro == null || in == null) {
            return null;
        }
        return buildtree(pro,0,pro.length-1,in,0,in.length-1);
    }
    public static  treeNode buildtree(int[] pro,int startproindex,int endproindex,int[] in, int startinIndex,int endinIndex){
        //前序的值，也就是每个子树的根节点
        int rootvalue = pro[startproindex];
        treeNode treerootNode = new treeNode(rootvalue);
        //只剩一一个值了
        if (startproindex == endproindex){
            //这里还有两种情况，如果中序也是否剩一个了
            if (startinIndex == endinIndex){
                return treerootNode;
            }else {
                throw new RuntimeException("提供的数据不对");
            }
        }
        //根据前序遍历的startindex找出根节点

        int getindex = getindex(in, rootvalue, startinIndex, endinIndex);
        //计算左子树的长度，与右子树的长度
        int leftTreeLength = getindex-startinIndex;
       //计算左子树最右端的
        int LeftRightindex =  startproindex+ leftTreeLength;

        //构造左子树

              if (leftTreeLength > 0){

            treerootNode.leftNode = buildtree(pro,startproindex+1,LeftRightindex,in,startinIndex,getindex-1);
        }
        //构造右子树?设什么情况下执行？
        //剩下的总长度大于左子树的长度那就存在
        if (endproindex-startproindex > leftTreeLength){
            treerootNode.rightNode = buildtree(pro,LeftRightindex+1,endproindex,in,getindex+1,endinIndex);

        }
         return treerootNode;
    }


    public static  int getindex(int[] array,int data,int startindex,int endindex){
        if (startindex == endindex){
            return startindex;
        }
        for (int i = startindex; i <= endindex; i++) {
            if (data == array[i]){
                return i;
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        int[] pro = {1,2,4,7,3,5,6,8};
        int[] in =  {4,7,2,1,5,3,8,6};
        treeNode solution = solution(pro, in);
        System.out.println(solution.value);


    }



    }

