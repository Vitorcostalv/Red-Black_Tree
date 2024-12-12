public class Node {
    int key;
    Node left, right, parent;
    boolean color; // true = Red, false = Black

    public Node(int key) {
        this.key = key;
        this.left = this.right = this.parent = null;
        this.color = true; // Novo nó é sempre vermelho
    }
}
