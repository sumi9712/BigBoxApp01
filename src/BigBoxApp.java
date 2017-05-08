import java.util.Scanner;

public class BigBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Big Box App\n");
		
		Scanner sc = new Scanner (System.in);
		String division ="";
		String store = "";
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y"))
		
		{
			division = Validator.getStringNumeric(sc,"Enter division number", 3);
			store = Validator.getStringNumeric(sc,"Enter store number",5);
			
			Store s = StoreDB.getStoreByDivisionStore(division, store);
			System.out.println("store found for division"+s.getDivision()+"  and storeNbr"+s.getStore());
			System.out.println("Store : store#="+ s.getStore()+", div#="+ s.getDivision()+ ", sales ="+ s.getSales());
			System.out.println("id="+s.getId()+", name ="+ s.getName()+", address= "+s.getAddress()+ 
					", city = "+s.getCity()+ ",state ="+s.getState()+", zipcode ="+s.getZipcode());
			 System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	        
	            
		}
		
		
	}

}

