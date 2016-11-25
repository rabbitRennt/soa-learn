package com.jumore.b2b.activity.base.service.compound;

import java.util.List;

import com.jumore.b2b.activity.base.mapper.compound.BaseMapper;

/**
 * 服务curd基类
 * 
 * @author fanwg
 * @date 　　2016年7月1日　上午10:25:35
 * @email renntrabbit@foxmail.com
 * @param <T>
 * @param <E>
 * @param <K>
 */
public class BaseServiceImp<T, E, K> implements IBaseService<T, E, K> {

	protected BaseMapper<T, E, K> baseMapper;

	public void setBaseCmpPKMapper(BaseMapper<T, E, K> baseMapper) {
		this.baseMapper = baseMapper;
	}

	@Override
	public long countByExample(E e) {
		return baseMapper.countByExample(e);
	}

	@Override
	public int deleteByExample(E e) {
		return baseMapper.deleteByExample(e);
	}

	@Override
	public int deleteByPrimaryKey(K k) {
		return baseMapper.deleteByPrimaryKey(k);
	}

	@Override
	public long insert(T t) {
		return baseMapper.insert(t);
	}

	@Override
	public long insertSelective(T t) {
		return baseMapper.insertSelective(t);
	}

	@Override
	public List<T> selectByExample(E e) {
		return baseMapper.selectByExample(e);
	}

	@Override
	public T selectByPrimaryKey(K k) {
		return baseMapper.selectByPrimaryKey(k);
	}

	@Override
	public int updateByExampleSelective(T t, E e) {
		return baseMapper.updateByExampleSelective(t, e);
	}

	@Override
	public int updateByExample(T t, E e) {
		return baseMapper.updateByExample(t, e);
	}

	@Override
	public int updateByPrimaryKeySelective(K k) {
		return baseMapper.updateByPrimaryKeySelective(k);
	}

	@Override
	public int updateByPrimaryKey(K k) {
		return baseMapper.updateByPrimaryKey(k);
	}

}
