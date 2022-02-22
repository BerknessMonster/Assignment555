package com.coderscampus;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		FileIntake fileRead = new FileIntake();
		PopulateFile populateFile = new PopulateFile();

		ArrayList<SaleData> modelSales = fileRead.readData("model3");
		populateFile.populateTeslaData(modelSales, "3");

		ArrayList<SaleData> modelSalesS = fileRead.readData("modelS");
		populateFile.populateTeslaData(modelSalesS, "S");

		ArrayList<SaleData> modelSalesX = fileRead.readData("modelX");
		populateFile.populateTeslaData(modelSalesX, "X");

	}

}
