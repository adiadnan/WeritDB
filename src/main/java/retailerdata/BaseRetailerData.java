package retailerdata;

import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import crawling.Crawler;

public class BaseRetailerData implements Crawlable {
	private String company;
	private String description_xpath;
	private String measurements_xpath;
	private HtmlPage page;

	public BaseRetailerData(String url) {
		page = Crawler.getPageContent(url);
	}

	public AtomicData getBaseData(String xpath) {
		try {
			List<HtmlElement> items = (List<HtmlElement>) page.getByXPath(xpath);
			ArrayList<String> content = new ArrayList();
			if (items.isEmpty()) {
				return new AtomicData("NO_DATA_AT_XPATH", null);
			} else {
				for (HtmlElement item : items) {
					content.add(String.format("%s ", item.asText()));
				}
			}
			return new AtomicData(null, content);
		} catch (Exception exception) {
			exception.printStackTrace();
			return new AtomicData(exception.getMessage(), null);
		}
	}

	public String getMeasurements(String url) {
		return null;
	}

	public String getDescription(String url) {
		return null;
	}

	@Override
	public String toString() {
		return "BaseRetailerData [company=" + company + ", description_xpath=" + description_xpath
				+ ", measurements_xpath=" + measurements_xpath + "]";
	}

	public static void main(String[] args) {
		String url = "https://answear.ro/573399-vila-jeansi-calm.html?utm_campaign=2performant_channable&utm_medium=affiliate&utm_term=Vila+-+Jeansi+Calm&utm_source=2parale&utm_content=Vila&ref=2Parale";
		BaseRetailerData b = new BaseRetailerData(url);
		System.out.println(b.getBaseData("//select[@id='selectSize']/option[position()>1]").getData());
	}
}
