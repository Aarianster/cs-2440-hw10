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
    // What data structures should you use for R and C? For each of them, describe what "remove" and "add" means.
    // I used a queue for the C collection and a normal list for R. Remove would queue the node into the back of the list. And remove would dequeue the front of the list.

    public List<T> depthFirstSearch() {
        if (root == null) {
            return new List<>();
        }

        // Create collections C with stack and R (result)
        Stack<TreeNode<T>> nodeStack = new Stack<>();
        List<T> result = new List<>();

        nodeStack.push(root); // Push root onto C

        while (!nodeStack.isEmpty()) {
            TreeNode<T> current = nodeStack.pop(); //
            result.addAtEnd(current.getValue()); // Add current value to result after popping from stack

            for (TreeNode<T> child : current.getChildren()) {
                nodeStack.push(child); // Push children into Stack
            }
        }

        return result;
    }
    // What data structures should you use for R and C? For each of them, describe what "remove" and "add" means.
    // I used a stack for the C collection and a normal list for R. Remove would pop the top of the stack (holding the data) into the return. And Adding would push the elements from the data into the stack. If we want to search depth first. We need to

}
