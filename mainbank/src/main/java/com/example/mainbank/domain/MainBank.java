package com.example.mainbank.domain;

import jakarta.persistence.Entity;

/**
 * 取引銀行
 */
@Entity
public class MainBank extends BaseEntity {	
	private String name;
	
	private String bankCategory;

	//コンストラクタ
	public MainBank() {
		this.name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankCategory() {
		return bankCategory;
	}

	public void setBankCategory(String bankCategory) {
		this.bankCategory = bankCategory;
	}
	
	
}
