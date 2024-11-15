package com.example.mainbank.domain;

import java.util.ArrayList;
import java.util.List;

import com.example.mainbank.enums.BankCategory;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

/**
 * 銀行
 */
@Entity
public class Bank extends BaseEntity {
	
	/** 銀行名 */
	@Column(length = 1000)
	private String name = "";
	
	/** 銀行分類 */
	@Enumerated
	private BankCategory  category;
	
	@OneToMany(mappedBy="bank", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<MainBank> mainBankList;
	
	/** デフォルトコンストラクタ */
	public Bank() {
		super();
	}
	
	/** コンストラクタ */
	public Bank(String name, BankCategory  category) {
		super();
		this.name = name;
		this.category = category;
		this.mainBankList = new ArrayList<>();
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
	
	public void addMainBank(MainBank mainBank) {
		this.mainBankList.add(mainBank);
		mainBank.setBank(this);
	}

	public List<MainBank> getMainBankList() {
		return mainBankList;
	}

	public void setMainBankList(List<MainBank> mainBankList) {
		this.mainBankList = mainBankList;
	}

}
