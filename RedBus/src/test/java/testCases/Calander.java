package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import appUtils.BrowseOpen;

public class Calander extends BrowseOpen{

	@Test
	public void  cal() throws InterruptedException {
		driver.findElement(By.id("onward_cal")).click();
		String expextmy = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
		while(!expextmy.contains("Apr 2022")) {
			
			driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
			System.out.println(expextmy);

			expextmy = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			
		}
	for()
	}
	
}
