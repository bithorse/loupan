package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TanweiView;


/**
 * 摊位
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface TanweiService extends IService<TanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TanweiVO> selectListVO(Wrapper<TanweiEntity> wrapper);
   	
   	TanweiVO selectVO(@Param("ew") Wrapper<TanweiEntity> wrapper);
   	
   	List<TanweiView> selectListView(Wrapper<TanweiEntity> wrapper);
   	
   	TanweiView selectView(@Param("ew") Wrapper<TanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TanweiEntity> wrapper);
   	

}

