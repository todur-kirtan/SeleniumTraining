package smoketests;

import java.util.List;

public class DataReader {

	public static void main(String[] args) {
		readCSV();
	}
	
	public static void readCSV() {
		String filename = "C:\\SDETuniversity\\Files\\UserAccounts.csv";
		List <String[]> records = utilities.CSV.get(filename);
		//Iterating through the list
		for(String[] record : records) {
			for(String field : record) {
				System.out.println(field);
			}
		}
		
	}

}
