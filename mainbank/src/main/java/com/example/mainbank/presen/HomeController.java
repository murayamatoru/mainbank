package com.example.mainbank.presen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping({"/", "home"})
	public ModelAndView showHome(ModelAndView mav) {
		mav.addObject("SystemName", "取引銀行管理");
		mav.setViewName("home");
		return mav;
	}
}
