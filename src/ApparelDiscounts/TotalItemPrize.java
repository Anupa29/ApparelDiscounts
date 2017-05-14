package ApparelDiscounts;

import java.util.HashMap;

public class TotalItemPrize {

	public double calculatePrice(double price, double discount){
		double discountedPrice = price - (price*(discount/100.0));
		return discountedPrice;
	}
	public double generateFinalOutput(int[] inputs)
	{
		double finalPrize=0.0;
		DiscountCalculator calculator=new DiscountCalculator();
		
		//Inventory i=new Inventory();
		InventoryDetails i=new InventoryDetails();
		HashMap<Integer, ProductVB> items=i.inventoryDetails();
		for(int j=0;j<inputs.length;j++)
		{
			ProductVB product = items.get(inputs[j]);
			double discount=calculator.largestDiscount(product);
			finalPrize = finalPrize + calculatePrice(product.getPrice(),discount);
		}
		return finalPrize;
	}
}
