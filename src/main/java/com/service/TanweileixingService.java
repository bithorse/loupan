package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TanweileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TanweileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TanweileixingView;


/**
 * 摊位类型
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweileixingService extends IService<TanweileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TanweileixingVO> selectListVO(Wrapper<TanweileixingEntity> wrapper);
   	
   	TanweileixingVO selectVO(@Param("ew") Wrapper<TanweileixingEntity> wrapper);
   	
   	List<TanweileixingView> selectListView(Wrapper<TanweileixingEntity> wrapper);
   	
   	TanweileixingView selectView(@Param("ew") Wrapper<TanweileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TanweileixingEntity> wrapper);
   	

}

