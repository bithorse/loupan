package com.dao;

import com.entity.TanweileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TanweileixingVO;
import com.entity.view.TanweileixingView;


/**
 * 摊位类型
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweileixingDao extends BaseMapper<TanweileixingEntity> {
	
	List<TanweileixingVO> selectListVO(@Param("ew") Wrapper<TanweileixingEntity> wrapper);
	
	TanweileixingVO selectVO(@Param("ew") Wrapper<TanweileixingEntity> wrapper);
	
	List<TanweileixingView> selectListView(@Param("ew") Wrapper<TanweileixingEntity> wrapper);

	List<TanweileixingView> selectListView(Pagination page,@Param("ew") Wrapper<TanweileixingEntity> wrapper);
	
	TanweileixingView selectView(@Param("ew") Wrapper<TanweileixingEntity> wrapper);
	

}
