package ApparelDiscounts;


public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] customerIDs = {1,2,3,4};
		TotalItemPrize totaldiscountedPrice = new TotalItemPrize();
		double finalBill = totaldiscountedPrice.generateFinalOutput(customerIDs);
		System.out.println(finalBill);
		

	}

}
