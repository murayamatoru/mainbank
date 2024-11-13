package com.example.mainbank.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mainbank.domain.Bank;
import com.example.mainbank.domain.MainBank;
import com.example.mainbank.domain.repository.MainBankRepository;
import com.example.mainbank.enums.BankCategory;
/**
 * テストデータサービス
 */
@Service
public class TestDataService {

	@Autowired
	private MainBankRepository mainBankRepository;
	
	/** コンストラクタ */
	public TestDataService() {
		super();
	}
	
	@Transactional
	public boolean createTestData() {
		Bank b1 =  new Bank("三菱UFJ銀行", BankCategory.都市銀行);
		MainBank mb1 = new MainBank(b1);
		
		this.mainBankRepository.save(mb1);
		return true;
	}
}
