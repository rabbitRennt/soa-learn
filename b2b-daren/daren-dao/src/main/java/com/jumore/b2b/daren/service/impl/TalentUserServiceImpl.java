package com.jumore.b2b.daren.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jumore.b2b.activity.base.service.single.BaseServiceImp;
import com.jumore.b2b.daren.mapper.TalentUserMapper;
import com.jumore.b2b.daren.model.TalentUser;
import com.jumore.b2b.daren.model.TalentUserQueryHelper;
import com.jumore.b2b.daren.service.ITalentUserService;
@Service
public class TalentUserServiceImpl extends BaseServiceImp<TalentUser, TalentUserQueryHelper> implements ITalentUserService {

	static final Logger log = LogManager.getLogger(TalentUserServiceImpl.class);;

	TalentUserMapper talentUserMapper;

	@Autowired
	public void setTalentUserMapper(TalentUserMapper talentUserMapper) {
		this.talentUserMapper = talentUserMapper;
		this.setBaseMapper(talentUserMapper);
	}

}