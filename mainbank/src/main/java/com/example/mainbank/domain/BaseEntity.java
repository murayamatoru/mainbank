package com.example.mainbank.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

/**
 * エンティの基底クラス
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {
	
	//IDENTITYはエラー。理由はSpringWebAppDocのドメインモデルと永続化（継承の永続化戦略）
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE) 
	protected Long id;

	@CreatedDate
	protected LocalDate createdDate;
	
	@LastModifiedDate
	protected LocalDate mlastModifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
