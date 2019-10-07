
public class GiftBasket {
int id;
String type;
float Cost;
public GiftBasket(int id, String type, float cost) {
	this.id = id;
	this.type = type;
	Cost = cost;
}
public GiftBasket() {
	id=0;
	type="";
	Cost=0f;
	
}

public GiftBasket(GiftBasket giftbasket) {
	setId(giftbasket.getId());
	setType(giftbasket.getType());
	setCost(giftbasket.getCost());
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getCost() {
	return Cost;
}
public void setCost(float cost) {
	Cost = cost;
}



@Override
public String toString() {
	return "GiftBasket [id=" + id + ", type=" + type + ", Cost=" + Cost + "]";
}

void display(){
	
	System.out.println(toString());
	
}



}
