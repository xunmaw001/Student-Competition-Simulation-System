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
 * 公告信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-24 09:43:59
 */
@TableName("gonggaoxinxi")
public class GonggaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GonggaoxinxiEntity() {
		
	}
	
	public GonggaoxinxiEntity(T t) {
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
	 * 公告名称
	 */
					
	private String gonggaomingcheng;
	
	/**
	 * 公告类型
	 */
					
	private String gonggaoleixing;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 公告内容
	 */
					
	private String gonggaoneirong;
	
	/**
	 * 发布人
	 */
					
	private String faburen;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：公告名称
	 */
	public void setGonggaomingcheng(String gonggaomingcheng) {
		this.gonggaomingcheng = gonggaomingcheng;
	}
	/**
	 * 获取：公告名称
	 */
	public String getGonggaomingcheng() {
		return gonggaomingcheng;
	}
	/**
	 * 设置：公告类型
	 */
	public void setGonggaoleixing(String gonggaoleixing) {
		this.gonggaoleixing = gonggaoleixing;
	}
	/**
	 * 获取：公告类型
	 */
	public String getGonggaoleixing() {
		return gonggaoleixing;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：公告内容
	 */
	public void setGonggaoneirong(String gonggaoneirong) {
		this.gonggaoneirong = gonggaoneirong;
	}
	/**
	 * 获取：公告内容
	 */
	public String getGonggaoneirong() {
		return gonggaoneirong;
	}
	/**
	 * 设置：发布人
	 */
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
