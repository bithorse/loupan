package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShichangguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShichangguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShichangguanliyuanView;


/**
 * 市场管理员
 *
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public interface ShichangguanliyuanService extends IService<ShichangguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShichangguanliyuanVO> selectListVO(Wrapper<ShichangguanliyuanEntity> wrapper);
   	
   	ShichangguanliyuanVO selectVO(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
   	
   	List<ShichangguanliyuanView> selectListView(Wrapper<ShichangguanliyuanEntity> wrapper);
   	
   	ShichangguanliyuanView selectView(@Param("ew") Wrapper<ShichangguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShichangguanliyuanEntity> wrapper);
   	

}

