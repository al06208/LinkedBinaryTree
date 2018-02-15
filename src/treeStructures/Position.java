package treeStructures;

//This proves that I committed successfully! 
 
public class Position<E> {
    public E content;
    private Position<E> parent;
    private Position<E> leftChild;
    private Position<E> rightChild;
    private int spot;
    //0 is a parent, 1 is a left child, 2 is a right child
    public Position(){
        this.content = null;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    public Position(E e) {
        this.content = e;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }
   
    public Position<E> getParent(){
        return this.parent;
    }
 
    public void setParent(Position<E> p) {
        this.parent = p;
    }
    public Position<E> getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Position<E> leftChild) {
        this.leftChild = leftChild;
    }
    public Position<E> getRightChild() {
        return rightChild;
    }
    public void setRightChild(Position<E> rightChild) {
        this.rightChild = rightChild;
    }
    public int numChildren() {
        int i = 0;
        if (rightChild != null)
            i++;
        if (leftChild != null)
            i++;
        return i;  
    }
    public int getSpot() {
        return this.spot;
    }
    public void setSpot(int i) {
        this.spot = i;
    }
   
    public void addChild(Position<E> child) throws Exception {
        int i = this.numChildren();
        switch (i) {
        case 0: this.setLeftChild(child);
        child.setSpot(1);
        break;
        case 1: this.setRightChild(child);
        child.setSpot(2);
        break;
        case 2: throw new Exception("Attempt to cast additional child to full parent");
        }
           
       
    }
 
}