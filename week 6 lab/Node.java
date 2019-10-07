
public class Node {
GiftBasket data;
Node next;

public Node(GiftBasket data, Node next) {
	
	this.data = data;
	this.next = next;
}

public Node() {
	super();
	data = new GiftBasket();
	next = null;
}


public GiftBasket getData() {
	return data;
}

public void setData(GiftBasket data) {
	this.data = data;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}









}
