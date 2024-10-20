package com.example.mainbank.domain;

import jakarta.persistence.Entity;

/**
 * 取引銀行
 */
@Entity
public class MainBank extends BaseEntity {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
	
	private String name;

	//コンストラクタ
	public MainBank() {
		this.name = "";
	}
}
