package com.controller;

public class AccountController {

	public void addAccount(String s, String s1){
		System.out.println("Add account entered");
	}
	
	public void addAccount1(){
		if(true)
		System.out.println("Add1");
	}
	
	public String returnMethod(){
		return "Atif";
	}
	
	public void errorCheck(){
		try{
		throw new RuntimeException();
		}catch(RuntimeException e){
			throw e;
		}
	}
}
