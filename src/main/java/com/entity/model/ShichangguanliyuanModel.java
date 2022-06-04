package com.entity.model;

import com.entity.ShichangguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 市场管理员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public class ShichangguanliyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 管理电话
	 */
	
	private String guanlidianhua;
		
	/**
	 * 街道区域
	 */
	
	private String jiedaoquyu;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：管理姓名
	 */
	 
	public void setGuanlixingming(String guanlixingming) {
		this.guanlixingming = guanlixingming;
	}
	
	/**
	 * 获取：管理姓名
	 */
	public String getGuanlixingming() {
		return guanlixingming;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：管理电话
	 */
	 
	public void setGuanlidianhua(String guanlidianhua) {
		this.guanlidianhua = guanlidianhua;
	}
	
	/**
	 * 获取：管理电话
	 */
	public String getGuanlidianhua() {
		return guanlidianhua;
	}
				
	
	/**
	 * 设置：街道区域
	 */
	 
	public void setJiedaoquyu(String jiedaoquyu) {
		this.jiedaoquyu = jiedaoquyu;
	}
	
	/**
	 * 获取：街道区域
	 */
	public String getJiedaoquyu() {
		return jiedaoquyu;
	}
			
}
