/**
 * Class representing a Binary Search Tree data structure
 */
public class BST {
    People friends;
    People.Node root;

    /**
     * Constructor for the BST, taking in a linked list of friends from a Person object to be used in its methods
     */
    public BST(People friends) {
        this.friends = friends;
        this.root = root;
    }

    /**
     * Inserts a Node containing a Person object into the given binary search tree
     * @param tree the given BST
     * @param z the node to insert into the BST
     */
    public void treeInsert(BST tree, People.Node z){
        People.Node y = null;
        People.Node x = root;

        while(x != null){
            y = x;
            if(z.getPerson().getName().compareToIgnoreCase(x.getPerson().getName()) < 0 ){ //z.key < x.key
                x = x.left;
            } else x = x.right;
        }
        z.p = y;
        if( y == null){
            root = z; //tree was empty
        } else if(z.getPerson().getName().compareToIgnoreCase(y.getPerson().getName()) < 0){ //z.key < y.key
            y.left = z;
        } else y.right = z;
    }

    /**
     * Builds the binary search tree using the values from the friends list
     * @param tree the binary search tree
     * @return the completed BST
     */
    public BST buildBST(BST tree){
        People.Node currNode = friends.getHead();
        //traverse n nodes, where n = size of friends linked list
        if(tree.root == null) {
            while (currNode != null) {
                treeInsert(tree, currNode);
                currNode = currNode.next;
            }
        }
        return tree;
    }

    /**
     * In order tree walk starting from the node x
     * @param x the value we want to start the in order walk on
     */
    public void inorderTreeWalk(People.Node x){
        if(x != null){
            inorderTreeWalk(x.left);
            System.out.print(x.getPerson().getName() + " ");
            inorderTreeWalk(x.right);
        } else return;
    }

    /**
     * Builds the BST and prints out the values in order
     * @param tree the binary search tree
     */
    public void BSTSort(BST tree){
        this.buildBST(tree);
        this.inorderTreeWalk(root);
    }

    public void sop(Object s){
        System.out.println(s);
    }

    public People.Node getRoot(){
        return root;
    }

}
