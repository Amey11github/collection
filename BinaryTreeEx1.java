import java.util.*;


class BinaryTreeEx1
{
	public static void main(String[] args) {
		BinaryTree<Character> tree=new BinaryTree<Character>();
		tree.root=new BinaryTree.Node<Character>('A');
		tree.root.left=new BinaryTree.Node<Character>('B');
		tree.root.right=new BinaryTree.Node<Character>('C');
		tree.root.left.left=new BinaryTree.Node<Character>('D');
		tree.root.left.left.left=new BinaryTree.Node<Character>('H');
		tree.root.left.right=new BinaryTree.Node<Character>('E');
		tree.root.left.right.left=new BinaryTree.Node<Character>('I');
		tree.root.right.left=new BinaryTree.Node<Character>('F');
		tree.root.right.right=new BinaryTree.Node<Character>('G');

		System.out.print("preorder() : ");
		tree.preOrder(tree.root);
		System.out.println();

		System.out.print("postOrder() : ");
		tree.postOrder(tree.root);
		System.out.println();

		System.out.print("inOrder() : ");
		tree.inOrder(tree.root);
	}
}