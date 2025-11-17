public class TestTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);

        TreeNode<Integer> n2 = new TreeNode<>(2);
        n2.addChild(new TreeNode<>(5));
        n2.addChild(new TreeNode<>(6));

        TreeNode<Integer> n3 = new TreeNode<>(3);
        TreeNode<Integer> n4 = new TreeNode<>(4);
        n4.addChild(new TreeNode<>(7));
        n4.addChild(new TreeNode<>(8));

        root.addChild(n2);
        root.addChild(n3);
        root.addChild(n4);

        Tree<Integer> tree = new Tree<>(root);
        List<Integer> bfs = tree.breadthFirstSearch();

        System.out.println("BFS: ");
        for (Integer value : bfs) {
            System.out.print(value + " ");

        }
        System.out.println();

        List<Integer> dfs = tree.depthFirstSearch();
        System.out.println("DFS: ");
        for (Integer value : dfs) {
            System.out.print(value + " ");

        }
        System.out.println();







        
        
        
    }
}