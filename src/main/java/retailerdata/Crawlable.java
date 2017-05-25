package retailerdata;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public interface Crawlable {
	String getMeasurements(String url);
	String getDescription(String url);
	AtomicData getBaseData(String xpath);
}
