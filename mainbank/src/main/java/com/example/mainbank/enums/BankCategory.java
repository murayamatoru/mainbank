package com.example.mainbank.enums;

import java.io.Serializable;

/**
 * 銀行分類
 */
public enum BankCategory implements Serializable {

	都市銀行("都"), 
	地方銀行("地"), 
	ネット銀行("ネ");

	private String value;
	
	BankCategory(String value){
		this.value  = value;
	}

	public String getValue() {
		return value;
	}


	
	
//	/**
//	 * 銀行分類（列挙型）
//	 */
//	public enum Category {
//		都市銀行("都"), 
//		地方銀行("地"), 
//		ネット銀行("ネ");
//		
//		private final String value;
//		
//		Category(String value){
//			this.value = value;
//		}
//
//		public String getValue() {
//			return this.value;
//		}
//		
//		//Thymeleaf の<select>ドロップボックス作成時に使用する
//		public static final HashMap<String, String> MAP;
//		//static initializer
//		static {
//			MAP = new HashMap<String, String>();
//			for(Category cat : Category.values()) {
//				MAP.put(cat.name(), cat.getValue());
//			}
//		}
//		
//	}


}
