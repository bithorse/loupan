package com.dao;

import com.entity.TanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TanzhuVO;
import com.entity.view.TanzhuView;


/**
 * 摊主
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanzhuDao extends BaseMapper<TanzhuEntity> {
	
	List<TanzhuVO> selectListVO(@Param("ew") Wrapper<TanzhuEntity> wrapper);
	
	TanzhuVO selectVO(@Param("ew") Wrapper<TanzhuEntity> wrapper);
	
	List<TanzhuView> selectListView(@Param("ew") Wrapper<TanzhuEntity> wrapper);

	List<TanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<TanzhuEntity> wrapper);
	
	TanzhuView selectView(@Param("ew") Wrapper<TanzhuEntity> wrapper);
	

}
