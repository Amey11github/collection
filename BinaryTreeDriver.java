import java.util.*;

class BinaryTree<E>
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
		if(root==null) return;
		System.out.print(root.ele+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node<E> root)
	{
		if(root==null) return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.ele+" ");
	}

	public void inOrder(Node<E> root)
	{
		if(root==null) return ;

		inOrder(root.left);
		System.out.print(root.ele+" ");
		inOrder(root.right);
	}
}

class BinaryTreeDriver
{
	public static void main(String[] args) {

		BinaryTree<Character> tree=new BinaryTree<>();
		tree.root=new BinaryTree.Node<Character>('A');
		tree.root.left=new BinaryTree.Node<Character>('B');
		tree.root.right=new BinaryTree.Node<Character>('C');
		tree.root.left.left=new BinaryTree.Node<Character>('D');
		tree.root.left.right=new BinaryTree.Node<Character>('E');
		tree.root.right.left=new BinaryTree.Node<Character>('F');
		tree.root.right.right=new BinaryTree.Node<Character>('G');

		System.out.print("PreOrder() : ");
		tree.preOrder(tree.root);
		System.out.println();

		System.out.print("PostOrder() : ");
		tree.postOrder(tree.root);
		System.out.println();

		System.out.print("InOrder() : ");
		tree.inOrder(tree.root);
	}
}