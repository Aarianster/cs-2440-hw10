public class Tree<T> {
    private TreeNode<T> root;
    

    // No arg constructor
    public Tree() {
        this.root = null;
    }

    // One arg constrcutor. Creates root.
    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
       return root;
    }

    public List<T> breadthFirstSearch() {

        if (root == null) {
            return new List<>(); // Empty Result
        }

        // Create collections C (front queue) and R (result)
        Queue<TreeNode<T>> nodeQueue = new Queue<>();
        List<T> result = new List<>();

        nodeQueue.enqueue(root);

        while (!nodeQueue.isEmpty()) {
            TreeNode<T> current = nodeQueue.dequeue(); // The first pass will be root, then child
            result.addAtEnd(current.getValue());

            for (TreeNode<T> child : current.getChildren()) {
                nodeQueue.enqueue(child);
            }
        }
        return result;
    }
    

    public List<T> depthFirstSearch() {
        // TODO: Implement DFS
        // Don't forget to transform your collection R into a list at the end (if it is not already)
        return null; // For compiling purposes only. TODO: Replace by adequate return
    }
}
