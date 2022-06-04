package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TanzhuDao;
import com.entity.TanzhuEntity;
import com.service.TanzhuService;
import com.entity.vo.TanzhuVO;
import com.entity.view.TanzhuView;

@Service("tanzhuService")
public class TanzhuServiceImpl extends ServiceImpl<TanzhuDao, TanzhuEntity> implements TanzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TanzhuEntity> page = this.selectPage(
                new Query<TanzhuEntity>(params).getPage(),
                new EntityWrapper<TanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TanzhuEntity> wrapper) {
		  Page<TanzhuView> page =new Query<TanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TanzhuVO> selectListVO(Wrapper<TanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TanzhuVO selectVO(Wrapper<TanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TanzhuView> selectListView(Wrapper<TanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TanzhuView selectView(Wrapper<TanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
