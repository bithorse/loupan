package com.dao;

import com.entity.ShichangguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShichangguanliyuanVO;
import com.entity.view.ShichangguanliyuanView;


/**
 * 市场管理员
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface ShichangguanliyuanDao extends BaseMapper<ShichangguanliyuanEntity> {
	
	List<ShichangguanliyuanVO> selectListVO(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
	
	ShichangguanliyuanVO selectVO(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
	
	List<ShichangguanliyuanView> selectListView(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);

	List<ShichangguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
	
	ShichangguanliyuanView selectView(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
	

}
