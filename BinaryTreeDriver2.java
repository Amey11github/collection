import java.util.*;

class BinaryTreeDriver2
{ 
	public static void main(String[] args) {
		BinaryTree<Character> btree=new BinaryTree<>();
		btree.root=new BinaryTree.Node<Character>('A');
		btree.root.left=new BinaryTree.Node<Character>('B');
		btree.root.right=new BinaryTree.Node<Character>('C');
		btree.root.left.left=new BinaryTree.Node<Character>('D');
		btree.root.left.right=new BinaryTree.Node<Character>('E');
		btree.root.right.left=new BinaryTree.Node<Character>('F');
		btree.root.right.right=new BinaryTree.Node<Character>('G');
		btree.root.right.right.left=new BinaryTree.Node<Character>('H');
		btree.root.right.right.right=new BinaryTree.Node<Character>('I');
		btree.root.right.left.left=new BinaryTree.Node<Character>('J');
		btree.root.right.left.right=new BinaryTree.Node<Character>('K');



		System.out.print("PreOrder() : ");
		btree.preOrder(btree.root);
		System.out.println();

		System.out.print("PostOrder() : ");
		btree.postOrder(btree.root);
		System.out.println();

		System.out.print("InOrder() : ");
		btree.inOrder(btree.root);
	}
}