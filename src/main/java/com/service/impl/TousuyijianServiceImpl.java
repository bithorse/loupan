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


import com.dao.TousuyijianDao;
import com.entity.TousuyijianEntity;
import com.service.TousuyijianService;
import com.entity.vo.TousuyijianVO;
import com.entity.view.TousuyijianView;

@Service("tousuyijianService")
public class TousuyijianServiceImpl extends ServiceImpl<TousuyijianDao, TousuyijianEntity> implements TousuyijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousuyijianEntity> page = this.selectPage(
                new Query<TousuyijianEntity>(params).getPage(),
                new EntityWrapper<TousuyijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousuyijianEntity> wrapper) {
		  Page<TousuyijianView> page =new Query<TousuyijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousuyijianVO> selectListVO(Wrapper<TousuyijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousuyijianVO selectVO(Wrapper<TousuyijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousuyijianView> selectListView(Wrapper<TousuyijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousuyijianView selectView(Wrapper<TousuyijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
