package com.entity.model;

import com.entity.TanweiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 摊位预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
public class TanweiyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 街道区域
	 */
	
	private String jiedaoquyu;
		
	/**
	 * 摊位号
	 */
	
	private String tanweihao;
		
	/**
	 * 摊位图片
	 */
	
	private String tanweitupian;
		
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
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 预约备注
	 */
	
	private String yuyuebeizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
				
	
	/**
	 * 设置：摊位号
	 */
	 
	public void setTanweihao(String tanweihao) {
		this.tanweihao = tanweihao;
	}
	
	/**
	 * 获取：摊位号
	 */
	public String getTanweihao() {
		return tanweihao;
	}
				
	
	/**
	 * 设置：摊位图片
	 */
	 
	public void setTanweitupian(String tanweitupian) {
		this.tanweitupian = tanweitupian;
	}
	
	/**
	 * 获取：摊位图片
	 */
	public String getTanweitupian() {
		return tanweitupian;
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
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：预约备注
	 */
	 
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
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
