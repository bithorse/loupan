package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousuyijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousuyijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousuyijianView;


/**
 * 投诉意见
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TousuyijianService extends IService<TousuyijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousuyijianVO> selectListVO(Wrapper<TousuyijianEntity> wrapper);
   	
   	TousuyijianVO selectVO(@Param("ew") Wrapper<TousuyijianEntity> wrapper);
   	
   	List<TousuyijianView> selectListView(Wrapper<TousuyijianEntity> wrapper);
   	
   	TousuyijianView selectView(@Param("ew") Wrapper<TousuyijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousuyijianEntity> wrapper);
   	

}

