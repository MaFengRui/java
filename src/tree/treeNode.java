package tree;

/**
 * Created with IDEA
 * author 光明顶斗士
 * Date:18-12-28
 * Time:上午8:10
 * Vision:1.1
 * Description:二叉树节点～
 */
public class treeNode {
    public treeNode leftNode;
    public treeNode rightNode;
    public int value;

    public treeNode() {
    }
    public treeNode(int value){
        this.leftNode = null;
        this.rightNode = null;
        this.value = value;
    }
}
