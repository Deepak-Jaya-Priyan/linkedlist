 class love {
    int key;
    love left,right;
    public love(int item){
        key=item;
        left=right=null;
    }
}
class BinaryTree{
    love root;
    public void traverseTree(love node){
        if(node!=null){
            traverseTree(node.left);
            System.out.println(" "+node.key);
            traverseTree(node.right);

        }
    }
    public static void main(String args[]){
        BinaryTree tree= new BinaryTree();
        tree.root=new love(1);
        tree.root.left=new love(2);
        tree.root.right=new love(3);
        tree.root.right.right=new love(4);
        tree.root.left.left=new love(5);
        System.out.println("\nBinaryTree:");
        tree.traverseTree(tree.root);

    }

}
    
    
    

