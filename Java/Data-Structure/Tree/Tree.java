package Tree;


/*
          (1)
         ↙   ↘
       (2)    (3)
      ↙   ↘
   (4)     (5)
   Inorder (Left, Root, Right) -> 4 2 5 1 3
   Preorder (Root, Left, Right) -> 1 2 4 5 3
   Postorder (Left, Right, Root) -> 4 5 2 3 1
*/

class Node{
    int data;
    Node left;
    Node right;
}

public class Tree{
    public Node root;

    public void setRoot(Node node){
        this.root = node;
    }
    public Node getRoot(){
        return root;
    }
    public Node makeNode(Node left, int data, Node right){
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }
    // 중위 순회
    public void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    //전위 순회
    public void preorder(Node node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    //후위 순회
    public void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

}

class Program{
        public static void main(String[] args){

            Tree t = new Tree();
            Node n4 = t.makeNode(null, 4, null);
            Node n5 = t.makeNode(null, 5, null);
            Node n2 = t.makeNode(n4, 2, n5);
            Node n3 = t.makeNode(null, 3, null);
            Node n1 = t.makeNode(n2, 1, n3);
            t.setRoot(n1);
            t.inorder(t.getRoot());
            System.out.println("");

            t.preorder(t.getRoot());
            System.out.println("");

            t.postorder(t.getRoot());
            System.out.println("");
        }
}
