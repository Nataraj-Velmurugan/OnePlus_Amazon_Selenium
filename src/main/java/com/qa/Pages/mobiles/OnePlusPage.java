package com.qa.Pages.mobiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.AppSpecifics.ProjectSpecific;
import com.qa.Pages.Successpage;

public class OnePlusPage extends ProjectSpecific {

	public Successpage leastPriceMobile() throws InterruptedException {

		log.info("In Home page, enter text as OnePlus");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus");

		driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']")).click();

		driver.findElement(
				By.xpath("//*[contains(@class, 'a-size-base a-color-base') and normalize-space(text()) = 'OnePlus']"))
				.click();

		List<WebElement> allMobilePrice = driver.findElementsByXPath("//*[contains(@class, 'a-price-whole')]");

		ArrayList<Long> extractedMobilePrice = new ArrayList<Long>();

		for (int i = 0; i < allMobilePrice.size(); i++) {

			WebElement element = allMobilePrice.get(i);
			String mobilePrice = element.getText();

			long alteredMobilePrice = Long.valueOf(mobilePrice.replaceAll(",", "").toString());
			extractedMobilePrice.add(alteredMobilePrice);

		}

		Collections.sort(extractedMobilePrice);

		for (WebElement element : allMobilePrice) {
			String mobilePrice = element.getText();
			long alteredMobilePrice = Long.valueOf(mobilePrice.replaceAll(",", "").toString());

			System.out.println(extractedMobilePrice.get(0));
			if (alteredMobilePrice == extractedMobilePrice.get(0)) {
				element.click();
			}
		}

		int index = 1;
		switchToWindow(index);

		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(" //*[contains(@class, 'nav-line-2') and normalize-space(text()) = 'Cart']"))
				.click();
		String subTotal = driver.findElement(By.xpath(
				"//div[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-buybox sc-java-remote-feature']/span/span"))
				.getText();

		long cartPrice = Double.valueOf(subTotal.replaceAll(",", "").toString()).longValue();
		long expectedCartPrice = extractedMobilePrice.get(0);
		Assert.assertEquals(expectedCartPrice, cartPrice);

		return new Successpage();
	}

}
