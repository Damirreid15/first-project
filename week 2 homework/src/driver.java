
public class driver {

	public static void main(String[] args) {
		House house=new House();
		
		/*// int x=0;  
			//for(x=0;x<3;x++)
			{ 
			try {
				
			
		   
			Scanner in=new Scanner(System.in);
			System.out.println("please enter the house ID");	
			house.setID(in.nextInt());
			System.out.println("please enter the house price");	
			house.setPrice(in.nextFloat());
			System.out.println("please enter the house advertiser");	
			house.setAdvertiser(in.nextLine());
			FileWriter myWriter = new FileWriter("house.txt");
			myWriter.write("\t"+house.getID()+"\t"+house.getPrice()+"\t"+house.getAdvertiser()+"\t" +"\n");
			myWriter.close();
				
				
		//File myObj = new File("house.txt");
		 if (myObj.createNewFile()) { 
		        System.out.println("File created: " + myObj.getName()); 
		   
			//String advertiser;
			//float price=0;
		
		      } else { 
		        System.out.println("File already exists."); 
		      } 
		}catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();}
			}
		
		      /*if (myObj.exists()) {
		          System.out.println("File name: " + myObj.getName()); 
		          System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
		          System.out.println("Writable: " + myObj.canWrite()); 
		          System.out.println("Readable " + myObj.canRead()); 
		          System.out.println("File size in bytes " + myObj.length());
		        } else {
		          System.out.println("The file does not exist.");
		        }  
		      try { 
		          
		          System.out.println("Successfully wrote to the file.");
		       
		      
		      } catch (IOException e) {
		          System.out.println("An error occurred.");
		          e.printStackTrace();
		        }  */  
		
house.addinfo(house);

	
}
}
