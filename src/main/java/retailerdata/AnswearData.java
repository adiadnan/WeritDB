package retailerdata;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class AnswearData extends BaseRetailerData implements Crawlable{
	
	private String company = "answear";
	private String description_xpath = "//div[@class='content']//p";
	private String measurements_xpath = "";

	public AnswearData(String url) {
		super(url);
	}
	
	@Override
	public String getMeasurements(String url) {
		return null;
	}

}
