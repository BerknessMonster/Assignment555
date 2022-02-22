package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileIntake {
	public ArrayList<SaleData> readData(String filePath) throws IOException {
		
		ArrayList<SaleData> cars = new ArrayList<>();
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader(filePath));

		try {
			
			String readLine = reader.readLine();

			while ((readLine = reader.readLine()) != null) {
				String[] line = readLine.split(",");
				SaleData saleData = new SaleData(line[0], line[1]);
				cars.add(saleData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("fail because of IO-Exception");
			e.printStackTrace();
		}
		
		return cars;
	}

}
