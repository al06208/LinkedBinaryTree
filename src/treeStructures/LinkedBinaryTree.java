package treeStructures;
 
import java.util.Iterator;
 
public class LinkedBinaryTree<E> implements BinaryTree<E> {
    private Position<E> root;
   
    public void addRoot(E e) {
    	this.root = new Position<E>(e);
    }
    public void addChild(E e, Position<E> p) {
    	try {
    		p.addChild(new Position<E>(e));
    	}
    	catch(Exception gurbl) {
    		System.out.println(gurbl.getMessage());
    		System.exit(0);
    	}
    }
    @Override
    public Position<E> root() {
        return this.root;
    }
 
    @Override
    public Position<E> parent(Position<E> p) {
        return p.getParent();
    }
 
    @Override
    public Iterable<Position<E>> children(Position<E> p) {
        return null;
    }
 
    @Override
    public int numChildren(Position<E> p) {
        // TODO Auto-generated method stub
        return 0;
    }
 
    @Override
    public boolean isInternal(Position<E> p) {
        int i = p.getSpot();
        if (i != 0)
            return false;
        return true;
    }
 
    @Override
    public boolean isExternal(Position<E> p) {
        int i = p.getSpot();
        if(i==0)
            return false;
        else return true;
    }
 
    @Override
    public boolean isRoot(Position<E> p) {
        if (p == this.root())
            return true;
        else return false;
    }
 
    @Override
    public int size() {
        int sum = 0;
    	for (E e:this) {
        	sum++;
        }
    	return sum;
    }
 
    @Override
    public Iterator<E> iterator() {
    	return new BinaryTreePreOrder(this);
    }
 
    @Override
    public Iterable<Position<E>> positions() {
       
        return null;
    }
 
    @Override
    public Position<E> left(Position<E> p) {
        return p.getLeftChild();
    }
 
    @Override
    public Position<E> right(Position<E> p) {
        return p.getRightChild();
    }
 
    @Override
    public Position<E> sibling(Position<E> p) {
        int s = p.getSpot();
        switch (s) {
        case 1: if(p.getParent().getRightChild()!=null) return p.getParent().getRightChild();
        case 2: return p.getParent().getLeftChild();
        }
        return null;
    }
 
    @Override
    public boolean isEmpty() {
        if (this.root()!= null)
            return false;
        else return true;
    }
   
}