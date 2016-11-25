package com.jumore.b2b.activity.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jumore.b2b.activity.admin.base.BaseController;
import com.jumore.b2b.activity.admin.service.ITalentUserBiz;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.daren.api.ITalentUserApi;
import com.jumore.b2b.daren.model.TalentUser;

/**
 * 用户详情
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/user")
public class TalentUserController  extends BaseController{
	//private static final Logger log = LogManager.getLogger(StaticController.class);

	
	@Resource
	ITalentUserBiz talentUserBiz;
	@Reference
	ITalentUserApi talentUserApi;
	/**
	 * 达人主而
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/browser.do")
	public String about(Model model) {
		return "/static/about";
	};

	/**
	 * test
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/doBrowser.do")
	@ResponseBody
	public Object activityRule(Model model,TalentUser user) {
		user= talentUserApi.selectUnique(user);
		return user;
		//return talentUserBiz.selectPage(user,page,rows);
	};

}
