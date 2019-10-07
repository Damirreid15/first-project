
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList List=new LinkedList();
		System.out.println("Adding gifts");
		GiftBasket MothersDay= new GiftBasket(1,"perfume",8000f);
		GiftBasket FathersDay= new GiftBasket(2,"Shaving",9000f);
		GiftBasket EdibleArrangements= new GiftBasket(3,"Fruits",5000f);
		
		List.addToEnd(MothersDay);
		List.addToEnd(FathersDay);
		List.addToEnd(EdibleArrangements);
		
		
		List.display();
	}

}
