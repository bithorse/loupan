package com.dao;

import com.entity.TousuyijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousuyijianVO;
import com.entity.view.TousuyijianView;


/**
 * 投诉意见
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TousuyijianDao extends BaseMapper<TousuyijianEntity> {
	
	List<TousuyijianVO> selectListVO(@Param("ew") Wrapper<TousuyijianEntity> wrapper);
	
	TousuyijianVO selectVO(@Param("ew") Wrapper<TousuyijianEntity> wrapper);
	
	List<TousuyijianView> selectListView(@Param("ew") Wrapper<TousuyijianEntity> wrapper);

	List<TousuyijianView> selectListView(Pagination page,@Param("ew") Wrapper<TousuyijianEntity> wrapper);
	
	TousuyijianView selectView(@Param("ew") Wrapper<TousuyijianEntity> wrapper);
	

}
