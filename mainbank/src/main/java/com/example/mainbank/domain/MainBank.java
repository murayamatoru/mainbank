package com.example.mainbank.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

/**
 * 取引銀行
 */
@Entity
public class MainBank extends BaseEntity {
	
	/** 銀行 */
	private Bank bank;
	
	/** 取引開始日 */
	private LocalDate startDate;
	
	/**  コンストラクタ */
	public MainBank(Bank bank) {
		super();
		this.bank = bank;
	}

	/**  デフォルトコンストラクタ */
	public MainBank() {
		super();
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

}
