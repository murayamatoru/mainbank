package com.example.mainbank.presen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mainbank.domain.MainBank;
import com.example.mainbank.usecase.MainBankService;

@Controller
public class HomeController {
	
	@Autowired
	private MainBankService mainBankService;

	@GetMapping({"/", "home"})
	public ModelAndView showHome(ModelAndView mav) {
		mav.addObject("Title", "取引銀行管理");
		mav.setViewName("home");
		return mav;
	}
	
	/**
	 * テスト用データを作成する
	 * @param mav
	 * @return
	 */
	@GetMapping({"test/data/create"})
	public ModelAndView createTestData(ModelAndView mav) {
		mav.addObject("Title", "取引銀行管理（テストデータ作成結果）");
		
		MainBank  mb1 = new MainBank();
		mb1.setName("福岡銀行");
		this.mainBankService.addMainMank(mb1);
		
		MainBank  mb2 = new MainBank();
		mb2.setName("西日本シティ銀行");
		this.mainBankService.addMainMank(mb2);
		
		MainBank  mb3 = new MainBank();
		mb3.setName("みんなの銀行");
		this.mainBankService.addMainMank(mb3);

		mav.setViewName("test/data/creation-result");
		return mav;
	}
}
