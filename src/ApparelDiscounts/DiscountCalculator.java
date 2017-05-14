package ApparelDiscounts;

public class DiscountCalculator implements DiscountTypes {

	double discount = 0.0;
	@Override
	public double brandDiscount(String brand) {
		if(brand.equalsIgnoreCase("Arrow"))
			discount=20.0;
		else if(brand.equalsIgnoreCase("Wrangler"))
			discount=10.0;
		else if(brand.equalsIgnoreCase("Vero Moda"))
			discount=60.0;
		else if(brand.equalsIgnoreCase("UCB"))
			discount=0.0;
		else if(brand.equalsIgnoreCase("Adidas"))
			discount=5.0;
		else if(brand.equalsIgnoreCase("Provogue"))
			discount=20.0;
		return discount;
	}

	@Override
	public double categoryDiscount(String category) {
		
		if(category.equalsIgnoreCase("Shirts"))
			discount=0.0;
		else if(category.equalsIgnoreCase("Trousers"))
			discount=0.0;
		else if(category.equalsIgnoreCase("Casuals"))
			discount=30.0;
		else if(category.equalsIgnoreCase("Jeans"))
			discount=20.0;
		else if(category.equalsIgnoreCase("Dresses"))
			discount=0.0;
		else if(category.equalsIgnoreCase("Footwear"))
			discount=0.0;
		return discount;
	}

	@Override
	public double ancestralDiscount(String category) {
		if(category.equalsIgnoreCase("Dresses") || category.equalsIgnoreCase("Footwear" ))
			discount=50.0;
		return discount;
	}
	public double largestDiscount(ProductVB productVB){
		double discBrand = brandDiscount(productVB.getBrand());
		double discCat = categoryDiscount(productVB.getCategory());
		double discAnce = ancestralDiscount(productVB.getCategory());
		
		
		double max = discBrand;
		if(discCat>discBrand){
			max = discCat;
			
			if(discAnce>discCat){
				max = discAnce;
			}
			
		}
		else if(discAnce>discBrand){
			max=discAnce;
		}
		discount = max;
		//double output = calculatePrice(productVB.getPrice(),discount);
		return discount; 
		//return discount;
		
	}

}
