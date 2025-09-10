import java.util.*;

class BTree<E>
{

	Node<E> root;

	static class Node<E>
	{
		Node<E> left,right;
		E ele;

		Node(E ele)
		{
			this.ele=ele;
		}
	}

	public void preOrder(Node<E> root)
	{
		if(root==null) return ;
		System.out.print(root.ele+"");
		preOrder(root.left);
		preOrder(root.right)
	}

}

class BinaryTree2
{
	public static void main(String[] args) {
		BTree<Character> btree=new BTree<Character>();
		tree.root=new BTree.Node<Character> ('A');
		tree.root.left=new BTree.Node<Character> ('B');
		tree.root.right=new BTree.Node<Character>('C');
		tree.root.left.left=new BTree.Node<Character>('D');
		tree.root.left.right=new BTree.Node<Character('E');
		tree.root.right.left=new BTree.Node<Character>('F');
		tree.root.right.right=new BTree.Node<Character>('G');

		tree.preOrder(tree.root);
		

	}
}