public class SearchEngine {
    private RedBlackTree tree;

    public SearchEngine() {
        this.tree = new RedBlackTree();
    }

    public void add(int key) {
        tree.insert(key);
    }

    public boolean find(int key) {
        return tree.search(key);
    }
}
