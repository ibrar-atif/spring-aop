package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.AccountController;

public class AppClient {

	public static void main(String aa[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		AccountController actController= (AccountController) context.getBean("act");
		actController.addAccount();
	}
}
