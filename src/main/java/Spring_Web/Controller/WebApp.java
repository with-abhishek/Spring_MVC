package Spring_Web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class WebApp {

	@ResponseBody
	@RequestMapping("/")
	public String message()
	{
		return "index.jsp";
	}
}
