package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvHandler {

	public static final String[] FILE_HEADER_MAPPING = { "title", "aff_code", "price", "brand", "product_active",
			"category", "subcategory", "url", "image_urls" };
	public static final String ITEM_TITLE = "title";
	public static final String ITEM_AFF_CODE = "aff_code";
	public static final String ITEM_PRICE = "price";
	public static final String ITEM_BRAND = "brand";
	public static final String ITEM_PRODUCT_ACTIVE = "product_active";
	public static final String ITEM_CATEGORY = "category";
	public static final String ITEM_SUBCATEGORY = "subcategory";
	public static final String ITEM_URL = "url";
	public static final String ITEM_IMAGE_URLS = "image_urls";

	public CsvHandler(String[] FILE_HEADER_MAPPING) {

	}

	public static ArrayList<ClothingItem> getClothingItemsRows(String filePath) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		int output_ok_count = 0;
		int output_fail_count = 0;
		try {
			ArrayList<ClothingItem> items = new ArrayList<ClothingItem>();
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] line_content = line.split("\",\"");
				ClothingItem clothingItem = buildClothingItemObject(line_content);
				if (clothingItem != null) {
					items.add(clothingItem);
					output_ok_count++;
				} else {
					output_fail_count++;
				}

			}
			System.out.println(String.format("Fetched %d rows.\nFail count: %d.", output_ok_count, output_fail_count));
			return items;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException exception) {
				System.out.println("Error while closing fileReader/csvFileParser !!!");
				exception.printStackTrace();
			}

		}
	}

	public static ClothingItem buildClothingItemObject(String[] line) {
		try {
			String title = line[0].replaceAll("^\"|\"$", "");
			String aff_code = line[1];
			float price = Float.parseFloat(line[2]);
			String brand = line[3];
			boolean product_active = Boolean.parseBoolean(line[4]);
			String category = line[5];
			String subcategory = line[6];
			String url = line[7];
			String image_urls = line[8].replaceAll("^\"|\"$", "");
			return new ClothingItem(title, aff_code, price, brand, product_active, category, subcategory, url,
					image_urls);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		CsvHandler.getClothingItemsRows("F:\\PycharmProjects\\clover_simple_crawler\\feed_5b4d8196f.csv");
	}
}
