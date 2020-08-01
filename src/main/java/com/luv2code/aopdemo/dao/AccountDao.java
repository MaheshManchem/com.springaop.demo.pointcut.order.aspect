package com.luv2code.aopdemo.dao;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDao {
	private String name;
	private String servicecode;
	
	public void addAccount(Account a, Boolean flag){
		System.out.println(a.getAccountname() +"in account dao:addaccount method");
	}

	public String getName() {
		System.out.println("name in Getname method:"+name);
		return name;
	}

	public void setName(String name) {
		System.out.println("name in Setname method:"+name);
		this.name = name;
	}

	public String getServicecode() {
		System.out.println("name in Getservicecode method:"+servicecode);
		return servicecode;
	}

	public void setServicecode(String servicecode) {
		System.out.println("name in setservicecode method:"+servicecode);
		this.servicecode = servicecode;
	}
	
	
}
