package com.jumore.b2b.activity.admin.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.daren.model.TalentUser;

@Service
public interface ITalentUserBiz {

	Pages<?> selectPage(TalentUser user, int page, int rows);

}