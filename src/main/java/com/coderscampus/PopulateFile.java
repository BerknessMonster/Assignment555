package com.coderscampus;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PopulateFile {

	void populateTeslaData(List<SaleData> modelSales, String report) {

		Map<Integer, List<SaleData>> groupedByYearData = modelSales.stream()
				.collect(Collectors.groupingBy(j -> j.getDate().getYear()));
		
		String annualTotal = groupedByYearData.entrySet().stream()
				.map(date -> date.getKey() + " -> "+ date.getValue().stream()
				.collect(Collectors.summingInt(SaleData::getMonthlySales)))
				.collect(Collectors.joining("\n"));
		
		Collections.sort(modelSales, new Comparator<SaleData>() {
			
			@Override
			public int compare(SaleData saleData1, SaleData saleData2) {

				return saleData1.getMonthlySales()
						.compareTo(saleData2.getMonthlySales());

			}
		});
		
		SaleData worstMonth = modelSales.get(0);
		SaleData bestMonth = modelSales.get(modelSales.size() - 1);
		
		System.out.println("Model " + report + " Yearly Sales Report");
		System.out.println("---------------------------");
		System.out.println(annualTotal);
		System.out.println("");
		System.out.println("The best month for Model " + report + " was: " + bestMonth.getDate());
		System.out.println("The worst month for Model " + report + " was: " + worstMonth.getDate());
		System.out.println("");
	}

}