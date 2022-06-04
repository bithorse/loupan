package com.dao;

import com.entity.TanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TanweiVO;
import com.entity.view.TanweiView;


/**
 * 摊位
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweiDao extends BaseMapper<TanweiEntity> {
	
	List<TanweiVO> selectListVO(@Param("ew") Wrapper<TanweiEntity> wrapper);
	
	TanweiVO selectVO(@Param("ew") Wrapper<TanweiEntity> wrapper);
	
	List<TanweiView> selectListView(@Param("ew") Wrapper<TanweiEntity> wrapper);

	List<TanweiView> selectListView(Pagination page,@Param("ew") Wrapper<TanweiEntity> wrapper);
	
	TanweiView selectView(@Param("ew") Wrapper<TanweiEntity> wrapper);
	

}
