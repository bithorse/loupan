package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedaoquyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedaoquyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedaoquyuView;


/**
 * 街道区域
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface JiedaoquyuService extends IService<JiedaoquyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedaoquyuVO> selectListVO(Wrapper<JiedaoquyuEntity> wrapper);
   	
   	JiedaoquyuVO selectVO(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
   	
   	List<JiedaoquyuView> selectListView(Wrapper<JiedaoquyuEntity> wrapper);
   	
   	JiedaoquyuView selectView(@Param("ew") Wrapper<JiedaoquyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedaoquyuEntity> wrapper);
   	

}

