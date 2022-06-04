package com.entity.view;

import com.entity.JiedaoquyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 街道区域
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
@TableName("jiedaoquyu")
public class JiedaoquyuView  extends JiedaoquyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedaoquyuView(){
	}
 
 	public JiedaoquyuView(JiedaoquyuEntity jiedaoquyuEntity){
 	try {
			BeanUtils.copyProperties(this, jiedaoquyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
