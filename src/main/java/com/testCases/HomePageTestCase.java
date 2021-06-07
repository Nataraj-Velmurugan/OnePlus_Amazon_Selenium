package com.testCases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.qa.AppSpecifics.ProjectSpecific;
import com.qa.Pages.HomePage;


public class HomePageTestCase extends ProjectSpecific {
	
	@Test
	public void orderLeastOnePlusMobile() throws InterruptedException {
		System.out.println("oodd");
		log.info("alpha");
		test = extent.createTest("One Plus");
		test.log(Status.INFO, "order mobile started");
		new HomePage().orderMobile().leastPriceMobile();
		System.out.println("alpha");
		
	}

//	@Test
//	public void dropDownApplianceTest() {
//		test=extent.createTest("dropDownApplianceTest");
//		test.log(Status.INFO, "dropDownApplianceTest started");
//		new HomePage().dropDownClick().dropDownAppliances().onAppliancePage();
//	}
//	
//	@Test
//	public void dropDownElectronicsTest() {
//		test=extent.createTest("dropDownElectronicsTest");
//		test.log(Status.INFO, "dropDownElectronicsTest started");
//		new HomePage().dropDownClick().dropDownElectronics().onElectronicsPage();
//	}
//	
//	@Test
//	public void dropDownkindleStoreTest() {
//		test=extent.createTest("dropDownkindleStoreTest");
//		test.log(Status.INFO, "dropDownkindleStoreTest started");
//		new HomePage().dropDownClick().dropDownKindleStore().onkindlePage();
//		
//	}
//	
//	@Test
//	public void dropDownWatchesTest() {
//		test=extent.createTest("dropDownWatchesTest");
//		test.log(Status.INFO, "dropDownWatchesTest started");
//		new HomePage().dropDownClick().dropDownWatches().onWatchPage();
//	}

}
