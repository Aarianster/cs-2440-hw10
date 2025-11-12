public class TreeNode<T> {

    private T value;
    private TreeNode<T> next;

    public TreeNode(T value) {
          this.value = value;
          this.next = next;
    }

    public void addChild(TreeNode<T> child) {
        // TODO: Add a child to this node
        // You can choose *where* to add the child
        // but try to opt for the most time-efficient.
    }

    public List<TreeNode<T>> getChildren() {
        // TODO: Return the list of children
        return null; // For compiling purposes only. TODO: Replace by adequate return
    }

    public T getValue() {
        // TODO: Return the node's value
        return null; // For compiling purposes only. TODO: Replace by adequate return
    }
}
