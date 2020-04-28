package JZoffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 层序遍历，从上往下打印二叉树
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main22 {


    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            TreeNode node = queue.peek();
            list.add(node.val);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
            queue.poll();
        }
        return list;
    }
}
