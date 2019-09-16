import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class House {
private int ID;
private float price;
private String advertiser;
private photo image;
public House()
{
	
}

public House(int iD, float price, String advertiser, photo image) {
	ID = iD;
	this.price = price;
	this.advertiser = advertiser;
	this.image = image;
}


@Override
public String toString() {
	return "House [ID=" + ID + ", price=" + price + ", advertiser=" + advertiser + ", image=" + image + ", getID()="
			+ getID() + ", getPrice()=" + getPrice() + ", getAdvertiser()=" + getAdvertiser() + ", getImage()="
			+ getImage() + "]";
}


public int getID() {
	return ID;
}

public void setID(int iD) {
	this.ID = iD;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getAdvertiser() {
	return advertiser;
}

public void setAdvertiser(String advertiser) {
	this.advertiser = advertiser;
}

public photo getImage() {
	return image;
}

public void setImage(photo image) {
	this.image = image;
}


public void addinfo(House house) {
	
	 int x=0;  
		for(x=0;x<3;x++) {
			Scanner in=new Scanner(System.in);
			System.out.println("please enter the house ID");	
			house.setID(in.nextInt());
			
			System.out.println("please enter the house price");	
			house.setPrice(in.nextFloat());
			
			System.out.println("please enter the house advertiser");	
			house.setAdvertiser(in.next());
			
			/*System.out.println("please enter the house advertiser");	
			house.setImage(in.next());*/
			
					
	try {
		FileWriter myWriter = new FileWriter("housefile.txt",true);
	myWriter.write("\t"+house.getID()+"\t"+house.getPrice()+"\t"+house.getAdvertiser()+"\t" +/*house.image+*/"\n");
	myWriter.close();
	}catch (IOException e) {
	      System.out.println("An error occurred.");
	      }
		}
	}
	}




