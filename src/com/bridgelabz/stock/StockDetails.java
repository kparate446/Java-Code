/** 
 * Created By:- Krunal Parate
 * Date :-
 */
package com.bridgelabz.stock;

import java.util.Date;

// Create a POJO class
public class StockDetails {

	public String shareName;
	public int noOfShare;
	public float price;
	public String symbol;
	public String date;

	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StockDetails [shareName=" + shareName + ", noOfShare=" + noOfShare + ", price=" + price + ", symbol="
				+ symbol + ", date=" + date + "]";
	}



}
