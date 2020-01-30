/** 
 * Created By:- Krunal Parate
 * Date :-
 */

package com.bridgelabz.stock;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONObject;


public class Operations {

	StockDetails stockDetails = new StockDetails();

	/**Add Stock*/
	public List<StockDetails> addStock(List<StockDetails> list) { //method to add new stock
		// Enter the data from User
		System.out.println("Enter name of stock: ");
		stockDetails.setShareName(Utility.stringInput());

		System.out.println("Enter the Symbol");
		stockDetails.setSymbol(Utility.stringInput());

		System.out.println("Enter number of stocks: ");
		stockDetails.setNoOfShare(Utility.integerInput());

		System.out.println("Enter price of stock: ");
		stockDetails.setPrice(Utility.integerInput());

		System.out.println("Enter the date");
		String date = Utility.stringInput();
		stockDetails.setDate(Utility.stringInput());


		list.add(stockDetails); //adding data to list
		System.out.println("Details added successfully!");
		return list; //returning list of data]

	}

	/**ADD time*/
	public static String Time(){
		Date d= new Date();
		long millis = System.currentTimeMillis();
		java.util.Date date = new java.util.Date(millis);
		System.out.println(date);
		return null;
	}

	/**Remove Stock*/
	public List<StockDetails> removeStock(List<StockDetails> list) { //method to remove stock from file
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getShareName()); //showing all data by name
		}

		System.out.println("Enter name of stock to remove: ");
		String nameOfStock = Utility.stringInput();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getShareName().equalsIgnoreCase(nameOfStock)) { //matching user input in list

				list.remove(i);
				System.out.println("Stock removed!");
				break;
			}
		}
		return list;
	}

	/** Total Share in Company*/
	public void totalShare(List<StockDetails> list) { //method to calculate total shares
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getShareName()); //showing all shares by name
		}
		System.out.println("Enter stock name you want to calculate total: ");
		String stockName = Utility.stringInput();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getShareName().equalsIgnoreCase(stockName)) { //Compair
				float totalSharePrice = list.get(i).getPrice() * list.get(i).getNoOfShare(); //calculating total share price
				System.out.println("Total Share of " + list.get(i).getShareName() + " is "+list.get(i).getNoOfShare()+", Price : " + totalSharePrice); //displaying total share price
				break;
			}
		}
	}

	/** Total Share in Market */
	public void totalShareMarket(List<StockDetails> list) { //method to calculate total share price in markent
		float temp = 0,temp1 = 0;
		for(int i = 0; i<list.size(); i++) {
			float totalShare = list.get(i).getNoOfShare()*list.get(i).getNoOfShare(); 
			float totalprice = list.get(i).getNoOfShare()*list.get(i).getPrice();//calculating price each
			temp = temp+totalShare; //adding price of each share to make grand total
			temp1 = temp1 +totalprice ;
		}
		System.out.println("Total shares in market is: "+temp+", Price : "+temp1); //Total Price for Stock
	}

	/** Add Share */
	public List<StockDetails> addShare(List<StockDetails> list) { //method to calculate total shares
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getShareName()); //showing all shares by name
		}
		System.out.println("Enter stock name you want to calculate total: ");
		String stockName = Utility.stringInput();
		System.out.println("Add the Share");
		float share=Utility.integerInput();
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getShareName().equalsIgnoreCase(stockName)) { //Compair
				float addShare = list.get(i).getNoOfShare()+share;// Add the Share
				System.out.println(addShare);
			}
		}// Exit
		return list;
	}

	/** Remove Share*/
	public List<StockDetails> removeShare(List<StockDetails> list) { //method to calculate total shares
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getShareName()); //showing all shares by name
		}
		System.out.println("Enter stock name you want to calculate total: ");
		String stockName = Utility.stringInput();
		System.out.println("Remove the Share");
		float share=Utility.integerInput();
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getShareName().equalsIgnoreCase(stockName)) { //Compair
				float addShare = list.get(i).getNoOfShare()-share;// Add the Share
				System.out.println(addShare);
			}
		}
		return list;
	}

}






