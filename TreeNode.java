public class TreeNode<T> {

    private T value;
    private List<TreeNode<T>> child;

    public TreeNode(T value) {
          this.value = value;
          this.child = new List<>(); // Creates leaf.
    }

    public void addChild(TreeNode<T> child) {
        this.child.addAtEnd(child);
    }

    
    public List<TreeNode<T>> getChildren() {
        return child;
    }

    public T getValue() {
        return value; 
    }
}
