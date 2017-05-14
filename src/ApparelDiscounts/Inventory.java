package ApparelDiscounts;

import java.util.HashMap;

public class Inventory {

	public HashMap<Integer, ProductVB> inventoryDetails()
	{
		// TODO Auto-generated method stub

		ProductVB itemDetail1=new ProductVB();
		ProductVB itemDetail2=new ProductVB();
		ProductVB itemDetail3=new ProductVB();
		ProductVB itemDetail4=new ProductVB();
		ProductVB itemDetail5=new ProductVB();
		itemDetail1.setBrand("Arrow");
		itemDetail1.setCategory("Shirts");
		itemDetail1.setPrice(800);
		
		itemDetail2.setBrand("Vero Moda");
		itemDetail2.setCategory("Dresses");
		itemDetail2.setPrice(1400);
		
		itemDetail3.setBrand("Provogue");
		itemDetail3.setCategory("Footwear");
		itemDetail3.setPrice(1800);
		
		itemDetail4.setBrand("Wrangler");
		itemDetail4.setCategory("Jeans");
		itemDetail4.setPrice(2200);
		
		itemDetail5.setBrand("UCB");
		itemDetail5.setCategory("Shirts");
		itemDetail5.setPrice(1500);
		
		
		HashMap<Integer, ProductVB> inventory= new HashMap<Integer, ProductVB>();
		inventory.put(1, itemDetail1);
		inventory.put(2, itemDetail2);
		inventory.put(3, itemDetail3);
		inventory.put(4, itemDetail4);
		inventory.put(5, itemDetail5);
		return inventory;
		
	}
}


