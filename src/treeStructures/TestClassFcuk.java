package treeStructures;

public class TestClassFcuk {

	public static void main(String[] args) {
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<Integer>();
		t.addRoot(1);
		t.addChild(2, t.root());
		t.addChild(3, t.root());
		System.out.println(t.size());

	}

}
