package org.jsp.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class HomeController {
	@RequestMapping(value = "/open-home")
	public String openHomePage(Model model) {
		model.addAttribute("username", "venkatesh");
		return "home";
	}

	@RequestMapping(value = "/open-view")
	public String openView(@RequestParam(name = "view") String view) {
		return view;
	}

	@RequestMapping(value = "/sum")
	public String findSum(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model) {
		model.addAttribute("result", num1 + "+" + num2 + "=" + (num1 + num2));
		return "print";
	}

	@RequestMapping(value = "/diff")
	public String findDiff(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model) {
		model.addAttribute("result", num1 + "-" + num2 + "=" + (num1 - num2));
		return "print";
	}

	@RequestMapping(value = "/product")
	public String findProduct(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		model.addAttribute("result", num1 + "*" + num2 + "=" + (num1 * num2));
		return "print";
	}

	@RequestMapping(value = "/quotient")
	public String findQuotient(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		model.addAttribute("result", num1 + "/" + num2 + "=" + (num1 / num2));
		return "print";
	}

	@RequestMapping(value = "/reminder")
	public String findReminder(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		model.addAttribute("result", num1 + "%" + num2 + "=" + (num1 % num2));
		return "print";
	}

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("obj", new User());
		return modelAndView;
	}

	@RequestMapping("/register")
	@ResponseBody
	public String register(@ModelAttribute(value="obj") User user) {
        System.out.println(user);
        return "Details printed successfully";
	}
}
