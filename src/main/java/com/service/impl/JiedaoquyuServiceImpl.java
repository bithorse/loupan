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


import com.dao.JiedaoquyuDao;
import com.entity.JiedaoquyuEntity;
import com.service.JiedaoquyuService;
import com.entity.vo.JiedaoquyuVO;
import com.entity.view.JiedaoquyuView;

@Service("jiedaoquyuService")
public class JiedaoquyuServiceImpl extends ServiceImpl<JiedaoquyuDao, JiedaoquyuEntity> implements JiedaoquyuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedaoquyuEntity> page = this.selectPage(
                new Query<JiedaoquyuEntity>(params).getPage(),
                new EntityWrapper<JiedaoquyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedaoquyuEntity> wrapper) {
		  Page<JiedaoquyuView> page =new Query<JiedaoquyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedaoquyuVO> selectListVO(Wrapper<JiedaoquyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedaoquyuVO selectVO(Wrapper<JiedaoquyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedaoquyuView> selectListView(Wrapper<JiedaoquyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedaoquyuView selectView(Wrapper<JiedaoquyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
