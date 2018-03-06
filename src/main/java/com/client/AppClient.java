package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.JavaConfig;
import com.controller.AccountController;

public class AppClient {

	public static void main(String aa[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		AccountController actController= (AccountController) context.getBean("act");
		
		actController.addAccount1();
		
		actController.addAccount("Srini","JP Morgan");
		
		actController.returnMethod();
		try{
		actController.errorCheck();
		}catch(RuntimeException e){
			
		}

		
	}
}
