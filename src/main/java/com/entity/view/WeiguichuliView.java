package com.entity.view;

import com.entity.WeiguichuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 违规处理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
@TableName("weiguichuli")
public class WeiguichuliView  extends WeiguichuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeiguichuliView(){
	}
 
 	public WeiguichuliView(WeiguichuliEntity weiguichuliEntity){
 	try {
			BeanUtils.copyProperties(this, weiguichuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
