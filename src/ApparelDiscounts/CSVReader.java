package ApparelDiscounts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class CSVReader {

	public HashMap<Integer, ProductVB> inventoryDetails(){

        String csvFile = "/Users/anupa_choudhury/Desktop/datas.csv";
        String line = "";
        String cvsSplitBy = ",";
        HashMap<Integer, ProductVB> inventory1= new HashMap<Integer, ProductVB>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
        	
    		
    		
            while ((line = br.readLine()) != null) {

                // use comma as separator
            	ProductVB itemDetail=new ProductVB();
                String[] datas = line.split(cvsSplitBy);
                itemDetail.setBrand(datas[1].trim());
        		itemDetail.setCategory(datas[2].trim());
        		itemDetail.setPrice(Double.parseDouble(datas[3].trim()));
        		
                inventory1.put((Integer.parseInt(datas[0])), itemDetail);
                System.out.println( datas[0] +"," + datas[1] + ", "  +datas[2] + "," +datas[3]);
                }
         
        } catch (IOException e) {
            e.printStackTrace();
        }
		return inventory1;
		
		

    }
}
