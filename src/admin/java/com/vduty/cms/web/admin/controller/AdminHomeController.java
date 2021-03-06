package com.vduty.cms.web.admin.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vduty.cms.web.admin.entity.Admin;
import com.vduty.cms.web.admin.service.AdminMgrService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminHomeController extends AdminBaseController {

	private static final Logger logger = LoggerFactory.getLogger(AdminHomeController.class);

	@RequestMapping("/login")
	public String showLoginView(){
		return "admin/login";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/amdin", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String homepage(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/admin/index/{id}", method = RequestMethod.GET)
	public String index(@PathVariable String id, Locale locale, Model model) {
		logger.info("Welcome home index! The client locale is {}.", locale);

		Admin admin = adminService.getAdminByName(id);

		model.addAttribute("serverTime", admin.getPassword());

		return "home";
	}
	

}
