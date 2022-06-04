package com.dao;

import com.entity.TanweiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TanweiyuyueVO;
import com.entity.view.TanweiyuyueView;


/**
 * 摊位预约
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweiyuyueDao extends BaseMapper<TanweiyuyueEntity> {
	
	List<TanweiyuyueVO> selectListVO(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
	
	TanweiyuyueVO selectVO(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
	
	List<TanweiyuyueView> selectListView(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);

	List<TanweiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
	
	TanweiyuyueView selectView(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
	

}
