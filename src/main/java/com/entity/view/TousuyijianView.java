package com.entity.view;

import com.entity.TousuyijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉意见
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
@TableName("tousuyijian")
public class TousuyijianView  extends TousuyijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousuyijianView(){
	}
 
 	public TousuyijianView(TousuyijianEntity tousuyijianEntity){
 	try {
			BeanUtils.copyProperties(this, tousuyijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
