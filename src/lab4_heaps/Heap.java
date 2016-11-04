package lab4_heaps;
import java.lang.Comparable;
import java.util.ArrayList;

public class Heap implements MyHeap{
	
	private Node root;
	private ArrayList<Node> list = new ArrayList<Node>();
	
	public Node makeHeap(Comparable value) {
		list.add(root = new Node(value));
		return root;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public boolean insert(Comparable value) {
		Node node1 = new Node(value, null, null, list.get((list.size()+1)/2));
		list.add(node1);
		while(node1.getData().compareTo(node1.getParent().getData()) < 0) {
			shiftUp(node1);
		}
		
		return true;
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
}
