package com.example.mainbank.usecase;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mainbank.domain.Bank;
import com.example.mainbank.domain.MainBank;
import com.example.mainbank.domain.repository.BankRepository;
import com.example.mainbank.domain.repository.MainBankRepository;
import com.example.mainbank.enums.BankCategory;
/**
 * テストデータサービス
 */
@Service
public class TestDataService {

	@Autowired
	private BankRepository bankRepository;

	@Autowired
	private MainBankRepository mainBankRepository;
	
	/** コンストラクタ */
	public TestDataService() {
		super();
	}
	
	@Transactional
	public boolean createTestData() {
		Bank bank1 =  new Bank("三菱UFJ銀行", BankCategory.都銀);
		this.bankRepository.save(bank1);
		
		MainBank mainBank1 = new MainBank(bank1);
		mainBank1.setStartDate(LocalDate.now());
		bank1.addMainBank(mainBank1);
		this.mainBankRepository.save(mainBank1);
		
		return true;
	}
}
