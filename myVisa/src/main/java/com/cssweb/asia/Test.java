package com.cssweb.asia;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Test {
	@RequestMapping("/admin")
	public String test(HttpServletRequest request){
		
		String name = request.getParameter("name");
		
		String password = request.getParameter("password");
		
		System.out.println("名字：" + name + ",密码：" + password);
		
		return "index";
	}

}
