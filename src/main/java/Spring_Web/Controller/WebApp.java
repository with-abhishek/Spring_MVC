package spring_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class WebApp {

//	@ResponseBody
	@RequestMapping("/")
	public String message()
	{
		return "/index";
	}
}
