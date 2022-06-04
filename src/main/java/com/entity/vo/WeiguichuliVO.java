package com.entity.vo;

import com.entity.WeiguichuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 违规处理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public class WeiguichuliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 摊主姓名
	 */
	
	private String tanzhuxingming;
		
	/**
	 * 摊主手机
	 */
	
	private String tanzhushouji;
		
	/**
	 * 管理账号
	 */
	
	private String guanlizhanghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 管理电话
	 */
	
	private String guanlidianhua;
		
	/**
	 * 违规标题
	 */
	
	private String weiguibiaoti;
		
	/**
	 * 违规图片
	 */
	
	private String weiguitupian;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
		
	/**
	 * 违规内容
	 */
	
	private String weiguineirong;
		
	/**
	 * 处罚内容
	 */
	
	private String chufaneirong;
				
	
	/**
	 * 设置：摊主姓名
	 */
	 
	public void setTanzhuxingming(String tanzhuxingming) {
		this.tanzhuxingming = tanzhuxingming;
	}
	
	/**
	 * 获取：摊主姓名
	 */
	public String getTanzhuxingming() {
		return tanzhuxingming;
	}
				
	
	/**
	 * 设置：摊主手机
	 */
	 
	public void setTanzhushouji(String tanzhushouji) {
		this.tanzhushouji = tanzhushouji;
	}
	
	/**
	 * 获取：摊主手机
	 */
	public String getTanzhushouji() {
		return tanzhushouji;
	}
				
	
	/**
	 * 设置：管理账号
	 */
	 
	public void setGuanlizhanghao(String guanlizhanghao) {
		this.guanlizhanghao = guanlizhanghao;
	}
	
	/**
	 * 获取：管理账号
	 */
	public String getGuanlizhanghao() {
		return guanlizhanghao;
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
	 * 设置：违规标题
	 */
	 
	public void setWeiguibiaoti(String weiguibiaoti) {
		this.weiguibiaoti = weiguibiaoti;
	}
	
	/**
	 * 获取：违规标题
	 */
	public String getWeiguibiaoti() {
		return weiguibiaoti;
	}
				
	
	/**
	 * 设置：违规图片
	 */
	 
	public void setWeiguitupian(String weiguitupian) {
		this.weiguitupian = weiguitupian;
	}
	
	/**
	 * 获取：违规图片
	 */
	public String getWeiguitupian() {
		return weiguitupian;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
	}
				
	
	/**
	 * 设置：违规内容
	 */
	 
	public void setWeiguineirong(String weiguineirong) {
		this.weiguineirong = weiguineirong;
	}
	
	/**
	 * 获取：违规内容
	 */
	public String getWeiguineirong() {
		return weiguineirong;
	}
				
	
	/**
	 * 设置：处罚内容
	 */
	 
	public void setChufaneirong(String chufaneirong) {
		this.chufaneirong = chufaneirong;
	}
	
	/**
	 * 获取：处罚内容
	 */
	public String getChufaneirong() {
		return chufaneirong;
	}
			
}
