package com.example.mainbank.enums;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 銀行分類
 */
public enum BankCategory implements Serializable {
	都銀("A"), 
	地銀("B"), 
	ネット("C");

	private final String stringValue;

	private BankCategory(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	//Thymeleaf の<select>ドロップボックス作成時に使用する
	public static final HashMap<String, String> MAP;
	//static initializer
	static {
		MAP = new HashMap<String, String>();
		for (BankCategory cat : BankCategory.values()) {
			MAP.put(cat.name(), cat.getStringValue());
		}
	}
}
