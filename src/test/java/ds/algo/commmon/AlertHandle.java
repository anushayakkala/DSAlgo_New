package ds.algo.commmon;

public class AlertHandle {
	
	public static void alertHandle() {
		
	
	BrowserDriverManager.driver.switchTo().alert().accept();

}
}