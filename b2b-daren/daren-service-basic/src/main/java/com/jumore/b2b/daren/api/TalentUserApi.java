package com.jumore.b2b.daren.api;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.b2b.daren.model.TalentUser;
import com.jumore.b2b.daren.service.ITalentUserService;

@Service
public class TalentUserApi implements ITalentUserApi {

	static final Logger log = LogManager.getLogger(TalentUserApi.class);;

	@Resource
	ITalentUserService talentUserService;

	public TalentUser selectUnique(TalentUser activity) {
		System.out.println("come hrer..");
		
		//TalentUserQueryHelper e = new TalentUserQueryHelper();
		TalentUser t=new TalentUser(); 
		t.setIdCard("136132446513131");
		t.setMobile("13503120255");
		t.setName("test");
		return t;
		
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/*List<TalentUser> list = talentUserService.selectByExample(e);
		if (list.size() == 1) {
			return list.get(0);
		}
		return null;*/
	}
}