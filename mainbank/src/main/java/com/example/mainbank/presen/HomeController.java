package com.example.mainbank.presen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mainbank.usecase.TestDataService;

@Controller
public class HomeController {
	
	@Autowired
	private TestDataService testDataService;

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
		
		this.testDataService.createTestData();
		
		return mav;
	}
}
