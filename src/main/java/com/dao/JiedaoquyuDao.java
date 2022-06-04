package com.dao;

import com.entity.JiedaoquyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedaoquyuVO;
import com.entity.view.JiedaoquyuView;


/**
 * 街道区域
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface JiedaoquyuDao extends BaseMapper<JiedaoquyuEntity> {
	
	List<JiedaoquyuVO> selectListVO(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
	
	JiedaoquyuVO selectVO(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
	
	List<JiedaoquyuView> selectListView(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);

	List<JiedaoquyuView> selectListView(Pagination page,@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
	
	JiedaoquyuView selectView(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
	

}
