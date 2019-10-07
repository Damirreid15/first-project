
public class LinkedList {

	Node Head;

	public LinkedList(Node head) {
		
		Head = null;
	}


	public LinkedList() {
		
	}

	boolean isEmpty() {
		
		if(Head==null) {
			
			return true;
		}
		else {
			
			return false;
		}
		
}
	
	public boolean isfull() {
		
		Node temp=new Node();
		if(temp==null) {
			return true;
			
		}else {
			
			temp= null;
			return false;
		}
		
		
		
	}

	
	
	
	
	
	
	
public boolean addToEnd(GiftBasket giftbasket) {
	if (isfull()) {
		System.out.println("list is full, unable to add");
	return false;
	}
	else {
		Node nextItem=new Node();
		nextItem.setData(giftbasket);
			if(isEmpty()) {
				
				Head= nextItem;
			}else {
				
				Node current=Head;
				while(current.getNext()!=null) {
					
					current= current.getNext();
				}
			current.setNext(nextItem);
			}
			return true;
	}
		
	}

	public void display() {
		
		if(isEmpty()) {
			System.out.println("List is empty");
			
			
		}else {
			Node current=Head;
			while(current!=null) {
				current.getData().display();
				current=current.getNext();
			}
		}
		
		
		
	}

}
