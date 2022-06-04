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


import com.dao.TanweiyuyueDao;
import com.entity.TanweiyuyueEntity;
import com.service.TanweiyuyueService;
import com.entity.vo.TanweiyuyueVO;
import com.entity.view.TanweiyuyueView;

@Service("tanweiyuyueService")
public class TanweiyuyueServiceImpl extends ServiceImpl<TanweiyuyueDao, TanweiyuyueEntity> implements TanweiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TanweiyuyueEntity> page = this.selectPage(
                new Query<TanweiyuyueEntity>(params).getPage(),
                new EntityWrapper<TanweiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TanweiyuyueEntity> wrapper) {
		  Page<TanweiyuyueView> page =new Query<TanweiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TanweiyuyueVO> selectListVO(Wrapper<TanweiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TanweiyuyueVO selectVO(Wrapper<TanweiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TanweiyuyueView> selectListView(Wrapper<TanweiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TanweiyuyueView selectView(Wrapper<TanweiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
