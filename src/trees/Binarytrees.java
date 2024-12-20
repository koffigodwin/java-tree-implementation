package trees;

class Node{
    int data;
    Node left;
    Node right;


    public  Node(int data){
        this.data = data;
    }
}
public class Binarytrees {

    Node root;

    public void insertion(int data){

        root = recursiveinsert(root,data);
    }

    private Node recursiveinsert(Node root, int data) {

        if (root == null){
            root = new Node(data);
        }else if (data < root.data){
            root.left = recursiveinsert(root.left, data);
        }else if (data > root.data){
            root.right = recursiveinsert(root.right, data);
        }

        return root;
    }

    public  void In_order(){
       Intraversal(root);
        System.out.println();
    }
    public void Intraversal(Node root){
        if (root != null){
            System.out.print(root.data + " ");
            Intraversal(root.left);
            Intraversal(root.right);
        }
    }
    public  void Pre_order(){
        pretraversal(root);
        System.out.println();
    }
    public void pretraversal(Node root){
        if (root != null){
            pretraversal(root.left);
            System.out.print(root.data + " ");
            pretraversal(root.right);
        }
    }

    public  void Post_order(){
        postraversal(root);
        System.out.println();
    }
    public void postraversal(Node root){
        if (root != null){
            postraversal(root.left);
            postraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
}
