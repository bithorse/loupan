package com.entity.vo;

import com.entity.TousuyijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 投诉意见
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public class TousuyijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 管理电话
	 */
	
	private String guanlidianhua;
		
	/**
	 * 摊主账号
	 */
	
	private String tanzhuzhanghao;
		
	/**
	 * 摊主姓名
	 */
	
	private String tanzhuxingming;
		
	/**
	 * 摊主手机
	 */
	
	private String tanzhushouji;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：摊主账号
	 */
	 
	public void setTanzhuzhanghao(String tanzhuzhanghao) {
		this.tanzhuzhanghao = tanzhuzhanghao;
	}
	
	/**
	 * 获取：摊主账号
	 */
	public String getTanzhuzhanghao() {
		return tanzhuzhanghao;
	}
				
	
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
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
