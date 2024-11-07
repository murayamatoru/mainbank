package com.example.mainbank.domain;

import jakarta.persistence.Entity;

/**
 * 取引銀行
 */
@Entity
public class MainBank extends BaseEntity {
	
	/** 銀行種類 */
	public enum Category {
		都市銀行,
		地方銀行,
		ネット銀行
	}
	
	/** 銀行名 */
	private String name;
	
	/** 銀行種類 */
	private Category bankCategory;


	//コンストラクタ
	public MainBank(String name, Category category) {
		this.name = name;
		this.bankCategory = category;
	}

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

	public Category getBankCategory() {
		return bankCategory;
	}

	public void setBankCategory(Category bankCategory) {
		this.bankCategory = bankCategory;
	}

}
