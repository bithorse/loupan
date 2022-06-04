package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 摊位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
@TableName("tanwei")
public class TanweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TanweiEntity() {
		
	}
	
	public TanweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 摊位号
	 */
					
	private String tanweihao;
	
	/**
	 * 街道区域
	 */
					
	private String jiedaoquyu;
	
	/**
	 * 摊位图片
	 */
					
	private String tanweitupian;
	
	/**
	 * 摊位类型
	 */
					
	private String tanweileixing;
	
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
	 * 预约状态
	 */
					
	private String yuyuezhuangtai;
	
	/**
	 * 开放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kaifangshijian;
	
	/**
	 * 结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jieshushijian;
	
	/**
	 * 摊位简介
	 */
					
	private String tanweijianjie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：摊位类型
	 */
	public void setTanweileixing(String tanweileixing) {
		this.tanweileixing = tanweileixing;
	}
	/**
	 * 获取：摊位类型
	 */
	public String getTanweileixing() {
		return tanweileixing;
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
	 * 设置：预约状态
	 */
	public void setYuyuezhuangtai(String yuyuezhuangtai) {
		this.yuyuezhuangtai = yuyuezhuangtai;
	}
	/**
	 * 获取：预约状态
	 */
	public String getYuyuezhuangtai() {
		return yuyuezhuangtai;
	}
	/**
	 * 设置：开放时间
	 */
	public void setKaifangshijian(Date kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	/**
	 * 获取：开放时间
	 */
	public Date getKaifangshijian() {
		return kaifangshijian;
	}
	/**
	 * 设置：结束时间
	 */
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
	/**
	 * 设置：摊位简介
	 */
	public void setTanweijianjie(String tanweijianjie) {
		this.tanweijianjie = tanweijianjie;
	}
	/**
	 * 获取：摊位简介
	 */
	public String getTanweijianjie() {
		return tanweijianjie;
	}

}
