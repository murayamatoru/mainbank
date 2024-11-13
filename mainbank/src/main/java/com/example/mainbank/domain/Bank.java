package com.example.mainbank.domain;

import com.example.mainbank.enums.BankCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;

/**
 * 銀行
 */
@Entity
public class Bank extends BaseEntity {
	
	/** 銀行名 */
	private String name = "";
	
	/** 銀行分類 */
	@Enumerated
	private BankCategory  category;
	
	/** デフォルトコンストラクタ */
	public Bank() {
		super();
	}
	
	/** コンストラクタ */
	public Bank(String name, BankCategory  category) {
		super();
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankCategory getCategory() {
		return category;
	}

	public void setCategory(BankCategory category) {
		this.category = category;
	}

}
