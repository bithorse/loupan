package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TanweiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TanweiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TanweiyuyueView;


/**
 * 摊位预约
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweiyuyueService extends IService<TanweiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TanweiyuyueVO> selectListVO(Wrapper<TanweiyuyueEntity> wrapper);
   	
   	TanweiyuyueVO selectVO(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
   	
   	List<TanweiyuyueView> selectListView(Wrapper<TanweiyuyueEntity> wrapper);
   	
   	TanweiyuyueView selectView(@Param("ew") Wrapper<TanweiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TanweiyuyueEntity> wrapper);
   	

}

