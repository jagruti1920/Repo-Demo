
package browserhandle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class App_title {

	public static void main(String[] args) 
	{
		//Open Browser
		FirefoxDriver rv=new FirefoxDriver();
		//Open App
		rv.get("http://www.facebook.com");
		
		//App title
		String title = rv.getTitle();
		System.out.println("Browser page title is "+title);
		
		//App url
		String app_url = rv.getCurrentUrl();
		System.out.println("App url is "+app_url);
		

	}

}
