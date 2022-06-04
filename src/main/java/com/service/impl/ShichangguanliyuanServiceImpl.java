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


import com.dao.ShichangguanliyuanDao;
import com.entity.ShichangguanliyuanEntity;
import com.service.ShichangguanliyuanService;
import com.entity.vo.ShichangguanliyuanVO;
import com.entity.view.ShichangguanliyuanView;

@Service("shichangguanliyuanService")
public class ShichangguanliyuanServiceImpl extends ServiceImpl<ShichangguanliyuanDao, ShichangguanliyuanEntity> implements ShichangguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShichangguanliyuanEntity> page = this.selectPage(
                new Query<ShichangguanliyuanEntity>(params).getPage(),
                new EntityWrapper<ShichangguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShichangguanliyuanEntity> wrapper) {
		  Page<ShichangguanliyuanView> page =new Query<ShichangguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShichangguanliyuanVO> selectListVO(Wrapper<ShichangguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShichangguanliyuanVO selectVO(Wrapper<ShichangguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShichangguanliyuanView> selectListView(Wrapper<ShichangguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShichangguanliyuanView selectView(Wrapper<ShichangguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
