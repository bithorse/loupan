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


import com.dao.WeiguichuliDao;
import com.entity.WeiguichuliEntity;
import com.service.WeiguichuliService;
import com.entity.vo.WeiguichuliVO;
import com.entity.view.WeiguichuliView;

@Service("weiguichuliService")
public class WeiguichuliServiceImpl extends ServiceImpl<WeiguichuliDao, WeiguichuliEntity> implements WeiguichuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeiguichuliEntity> page = this.selectPage(
                new Query<WeiguichuliEntity>(params).getPage(),
                new EntityWrapper<WeiguichuliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeiguichuliEntity> wrapper) {
		  Page<WeiguichuliView> page =new Query<WeiguichuliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeiguichuliVO> selectListVO(Wrapper<WeiguichuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeiguichuliVO selectVO(Wrapper<WeiguichuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeiguichuliView> selectListView(Wrapper<WeiguichuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeiguichuliView selectView(Wrapper<WeiguichuliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
