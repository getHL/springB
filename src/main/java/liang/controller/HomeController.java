package liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/***
 * 
 * @author liangzhijian
 * @date 2016年8月12日
 * @time 下午2:23:34
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView index(){
		return new ModelAndView("index", "welcome", "welcome, liang!");
	}

}
