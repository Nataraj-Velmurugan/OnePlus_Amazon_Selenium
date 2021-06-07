package com.qa.Pages;

import com.qa.AppSpecifics.ProjectSpecific;

public class Successpage extends ProjectSpecific {
	
	public void onSuccess() {
		log.info("Page"); // class name , method name
		log.info("Page flow completed");
	}

}

