
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Arbol {
    public static class TreeNode{
        String val;
        List<TreeNode> children = new LinkedList<>();

        TreeNode(String data){
            val = data;
        }

        TreeNode(String data,List<TreeNode> child){
            val = data;
            children = child;
        }
    }

    private static void printNAryTree(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                TreeNode node = queue.poll();
                assert node != null;
                System.out.print(node.val + " ");
                for (TreeNode item : node.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("Pacientes");
        root.children.add(new TreeNode("Género"));
        root.children.add(new TreeNode("Sangre"));
        root.children.add(new TreeNode("Presión"));
        root.children.get(0).children.add(new TreeNode("Hombre"));
        root.children.get(0).children.add(new TreeNode("Mujer"));
        root.children.get(1).children.add(new TreeNode("A"));
        root.children.get(1).children.add(new TreeNode("B"));
        root.children.get(1).children.add(new TreeNode("AB"));
        root.children.get(1).children.add(new TreeNode("O"));
        root.children.get(2).children.add(new TreeNode("Alta"));
        root.children.get(2).children.add(new TreeNode("Media"));
        root.children.get(2).children.add(new TreeNode("Baja"));
        root.children.get(0).children.get(0).children.add(new TreeNode("Bryan"));
        printNAryTree(root);
    }
}
