package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private int russetCount;
	private int sweetCount;
	private int goldenCount;
	

	@RequestMapping("/")
	public String defaultPage() {
		return "default";
	}

	@RequestMapping("/twice-baked")
	public ModelAndView twiceBaked() {
		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("spuds");
		carbs.addObject("variety", "mashed");
		carbs.addObject("temp", 450);
		return carbs;
	}
	
	@RequestMapping("/survey")
	public ModelAndView survey(String answer) {
		ModelAndView mv= new ModelAndView();
			mv.setViewName("results");
			mv.addObject("userResponse", answer);
			
			if (answer.equals("Russet")) {
				russetCount += 1;
				//russetCount++;  Same thing, but considered "bad form"
			}
			if (answer.equals("Sweet")) {
				sweetCount += 1;
			}
			if (answer.equals("Golden")) {
				goldenCount += 1;
			}
			
			mv.addObject("russetCount",russetCount );
			mv.addObject("sweetCount",sweetCount );
			mv.addObject("goldenCount",goldenCount );
			
			return mv;
	}

}
