package com.vduty.cms.web.user.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vduty.cms.web.controller.BaseController;
import com.vduty.cms.web.admin.entity.Admin;
import com.vduty.cms.web.admin.entity.vo.JsonVo;
import com.vduty.cms.web.admin.exception.ValidateException;
import com.vduty.cms.web.admin.service.AdminMgrService;
import com.vduty.cms.web.constant.SystemConstant;
import com.vduty.cms.web.utils.MD5Utils;

/**
 * 管理员管理
 * @author lee
 *
 */
@Controller
@RequestMapping("/manageruser/user")
public class MessageController extends BaseController{
	

	@RequestMapping("/message")
	public String showUserMgr(@RequestParam(value = "p", defaultValue = "1") int pageNum,
			ModelMap modelMap){
		
		Subject subject = SecurityUtils.getSubject();
		modelMap.put("title_name",subject.getPrincipal());
		return "/user/userMgr/message";
	}
	
	
}
