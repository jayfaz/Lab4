package lab4_heaps;
import java.lang.Comparable;
import java.util.ArrayList;

public class Heap implements MyHeap{
	
	private Node root;
	private int size;

	/*
	 * Creates a node and sets the value
	 */
	public Node makeHeap(Comparable value) {
		this.root = new Node(value);
		size++;
		return root;
	}
	
	public boolean isEmpty() { //checks if root is empty
		return root == null;
	}
	
	public boolean insert(Comparable value) {
		Node n = new Node(value, null, null, findParent());
		size++;
		
	}
	
	public boolean deleteMin() {
		
	}
	
	public boolean decreaseKey(Node key, Comparable updateValue) {
		
	}
	
	public boolean delete(Node del) {
		
	}
	
	public boolean union(MyHeap heap) {
		
	}
	
	public Comparable findMin() {
		return root.getData();
	}
	
	public void shiftUp(Node n) {
		Node nodePar = n.getParent();
		Node temp = n;
		n.setData(nodePar.getData());
		nodePar.setData(temp.getData());
		
	}
	
	public boolean isNodeFull(node n) {
			return(n.getLeftChild() != null && n.getRightChild != null);
	}
	
	public Node findParent() {
		if(root.getLeftChild == null) {
			return root;
		}
	}
	
	public String toBinary(int n) {
		String tempString;
		if(n > 0) {
			return n%2 + toBinary(n/2);
		}
	}
}
