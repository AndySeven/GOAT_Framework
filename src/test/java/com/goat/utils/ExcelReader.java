package com.goat.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static FileInputStream fis;
	public static Workbook book;
	public static Sheet sheet;

	public static Workbook readExcelFile(String filePath) {

		try {
			fis = new FileInputStream(filePath);
			book = new XSSFWorkbook(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return book;
	}

	public static Sheet getExcelSheet(String filePath, String sheetName) {
		return readExcelFile(filePath).getSheet(sheetName);
	}

	public static int getNumRowsExcelSheet(String filePath, String sheetName) {
		return getExcelSheet(filePath, sheetName).getPhysicalNumberOfRows();
	}

	public static int getNumColsExcelSheet(String filePath, String sheetName, int rowNum) {
		return getExcelSheet(filePath, sheetName).getRow(rowNum).getLastCellNum();
	}

	public static String getCellValueExcelSheet(String filePath, String sheetName, int rowNum, int cellNum) {
		return getExcelSheet(filePath, sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

	public static List<Map<String, String>> getExcelData(String filePath, String sheetName) {
		List<Map<String, String>> data = new ArrayList<>();
		int rows = getNumRowsExcelSheet(filePath, sheetName);
		int cols = getNumColsExcelSheet(filePath, sheetName, 0);
		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				map.put(getCellValueExcelSheet(filePath, sheetName, 0, c), getCellValueExcelSheet(filePath, sheetName, r, c));
			}
			data.add(map);
		}
		return data;
	}

}
