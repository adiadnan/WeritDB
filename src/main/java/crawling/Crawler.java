package crawling;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Crawler {
	private static WebClient client;
	
	static{
		client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
	}
	
	public static HtmlPage getPageContent(String url){
		try{
			return client.getPage(url);
		}catch(Exception exception){
			exception.printStackTrace();
			return null;
		}
	}
	
}
