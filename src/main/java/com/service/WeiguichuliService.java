package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeiguichuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeiguichuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeiguichuliView;


/**
 * 违规处理
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface WeiguichuliService extends IService<WeiguichuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeiguichuliVO> selectListVO(Wrapper<WeiguichuliEntity> wrapper);
   	
   	WeiguichuliVO selectVO(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
   	
   	List<WeiguichuliView> selectListView(Wrapper<WeiguichuliEntity> wrapper);
   	
   	WeiguichuliView selectView(@Param("ew") Wrapper<WeiguichuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeiguichuliEntity> wrapper);
   	

}

