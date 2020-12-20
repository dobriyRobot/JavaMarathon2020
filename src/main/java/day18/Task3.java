package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] nodes = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int i = 0; i < nodes.length; i++) {
            addNewElements(nodes[i], root);
        }

        dfs(root);
    }

    //Вывод реально крут, смотрел в решении :)
    public static void dfs(Node root) {
        if (root == null){
            return;
        }
        dfs(root.getLeft());
        System.out.print(root.getValue() + " ");
        dfs(root.getRight());
    }


    public static void addNewElements(int newValue, Node root) {
        Node thisNode = null;
        Node newNode = root;
        while (newNode != null) {
            thisNode = newNode;
            if (newNode.getValue() < newValue) {
                newNode = thisNode.getRight();
            } else {
                newNode = thisNode.getLeft();
            }
        }
        if (thisNode.getValue() < newValue) {
            thisNode.setRight(new Node(newValue));
        } else {
            thisNode.setLeft(new Node(newValue));
        }

    }
}