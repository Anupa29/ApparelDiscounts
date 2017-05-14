package ApparelDiscounts;

import java.util.HashMap;

public class InventoryDetails {
	
	public HashMap<Integer, ProductVB> inventoryDetails() {

	CSVReader reader=new CSVReader();
	return reader.inventoryDetails();
	}
	
}
