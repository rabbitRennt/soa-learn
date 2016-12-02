package com.jumore.b2b.activity.admin.service;

import com.jumore.b2b.activity.comm.Pages;

@org.springframework.stereotype.Service
public class TalentUserBizImpl implements ITalentUserBiz {

	/*@Override
	public Pages<?> selectPage(TalentUser user, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Resource
	ITalentUserService talentUserService;
	
	@Override
	public Pages<?> selectPage(TalentUser user, int offset, int length) {
		PageHelper.startPage(offset,length);
		TalentUserQueryHelper e=new TalentUserQueryHelper();
		List<TalentUser> list=talentUserService.selectByExample(e);
		PageInfo<TalentUser> page=new PageInfo<TalentUser>(list);
		return new Pages<TalentUser>(page.getList(), page.getTotal(), offset, length);
		
		
	}*/
}