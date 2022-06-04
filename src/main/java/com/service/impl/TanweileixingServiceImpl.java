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


import com.dao.TanweileixingDao;
import com.entity.TanweileixingEntity;
import com.service.TanweileixingService;
import com.entity.vo.TanweileixingVO;
import com.entity.view.TanweileixingView;

@Service("tanweileixingService")
public class TanweileixingServiceImpl extends ServiceImpl<TanweileixingDao, TanweileixingEntity> implements TanweileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TanweileixingEntity> page = this.selectPage(
                new Query<TanweileixingEntity>(params).getPage(),
                new EntityWrapper<TanweileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TanweileixingEntity> wrapper) {
		  Page<TanweileixingView> page =new Query<TanweileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TanweileixingVO> selectListVO(Wrapper<TanweileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TanweileixingVO selectVO(Wrapper<TanweileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TanweileixingView> selectListView(Wrapper<TanweileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TanweileixingView selectView(Wrapper<TanweileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
