/**
 * 活动表
 * IActivityService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.daren.api;

import com.jumore.b2b.daren.model.TalentUser;


public interface ITalentUserApi{

	public TalentUser selectUnique(TalentUser activity);

}