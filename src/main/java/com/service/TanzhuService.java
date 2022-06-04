package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TanzhuView;


/**
 * 摊主
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanzhuService extends IService<TanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TanzhuVO> selectListVO(Wrapper<TanzhuEntity> wrapper);
   	
   	TanzhuVO selectVO(@Param("ew") Wrapper<TanzhuEntity> wrapper);
   	
   	List<TanzhuView> selectListView(Wrapper<TanzhuEntity> wrapper);
   	
   	TanzhuView selectView(@Param("ew") Wrapper<TanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TanzhuEntity> wrapper);
   	

}

