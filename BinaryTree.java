import javax.lang.model.util.Types;

public class BinaryTree {

    // Class containing left and right child
    // of current node and key value
    class Node {
        int key;
        Node left, right, parent;
    
        public Node(int item)
        {
            key = item;
            left = right = parent = null;
        }
        
    }

    protected int l; 
    
    protected int n;   

    public BinaryTree(){

    }

    protected int compare(){
        return 0;
    }





    

    
}
