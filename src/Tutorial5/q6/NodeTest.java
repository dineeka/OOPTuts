package Tutorial5.q6;

public class NodeTest {
    static void printLabel(Node n) {
        if (n instanceof TreeNode)
            System.out.print("Treenode-> ");
        else if (n instanceof Vertex)
            System.out.print("Vertex-> ");
        n.print();
    }
    public static void main(String[] args) {
        Node n1 = new TreeNode(100);
        Node n2 = new Vertex(500, 400);
        printLabel(n1);
        printLabel(n2);
    }

}
