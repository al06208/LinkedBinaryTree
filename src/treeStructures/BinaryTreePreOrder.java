package treeStructures;

import java.util.Iterator;

public class BinaryTreePreOrder implements Iterator {

	private LinkedBinaryTree<Position> t;
	private Position current;
	
	public BinaryTreePreOrder(LinkedBinaryTree i) {
		t = i;
		current = i.root();
	}
	
	@Override
	public boolean hasNext() {

		if (next()!=null) return true;
		else return false;
	}

	@Override
	public Position next() {
		current = next(current);
		return current;
	}
	public Position next(Position p) {
		int s = p.getSpot();
		switch(s) {
		case 0: return p.getLeftChild();
		case 1: Position temp = current;
		if (p.getLeftChild()!=null) return p.getLeftChild();
		if (p.getRightChild()!=null) return p.getRightChild();
		
		while(temp.getSpot()!=0) {
			if(temp.getSpot()==2) {
				temp = temp.getParent();
			}
			if(temp.getSpot()==1) {
				if(t.sibling(temp)!=null) return t.sibling(temp);
				else temp = temp.getParent();
			}
		}
		return null;
		case 2: Position squamp = current;
		if (p.getLeftChild()!=null) return p.getLeftChild();
		if (p.getRightChild()!=null) return p.getRightChild();
		while(squamp.getSpot()!=0) {
			if(squamp.getSpot()==2) {
				squamp = squamp.getParent();
			}
			if(squamp.getSpot()==1) {
				if(t.sibling(squamp)!=null) return t.sibling(squamp);
				else temp = squamp.getParent();
			}
		}
		
		
		}
		return p;
	}

}
