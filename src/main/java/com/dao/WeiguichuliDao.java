package com.dao;

import com.entity.WeiguichuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeiguichuliVO;
import com.entity.view.WeiguichuliView;


/**
 * 违规处理
 * 
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface WeiguichuliDao extends BaseMapper<WeiguichuliEntity> {
	
	List<WeiguichuliVO> selectListVO(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
	
	WeiguichuliVO selectVO(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
	
	List<WeiguichuliView> selectListView(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);

	List<WeiguichuliView> selectListView(Pagination page,@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
	
	WeiguichuliView selectView(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
	

}
