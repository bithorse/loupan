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


import com.dao.TanweiDao;
import com.entity.TanweiEntity;
import com.service.TanweiService;
import com.entity.vo.TanweiVO;
import com.entity.view.TanweiView;

@Service("tanweiService")
public class TanweiServiceImpl extends ServiceImpl<TanweiDao, TanweiEntity> implements TanweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TanweiEntity> page = this.selectPage(
                new Query<TanweiEntity>(params).getPage(),
                new EntityWrapper<TanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TanweiEntity> wrapper) {
		  Page<TanweiView> page =new Query<TanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TanweiVO> selectListVO(Wrapper<TanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TanweiVO selectVO(Wrapper<TanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TanweiView> selectListView(Wrapper<TanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TanweiView selectView(Wrapper<TanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
