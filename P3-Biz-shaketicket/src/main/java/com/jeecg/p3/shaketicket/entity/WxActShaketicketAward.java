package com.jeecg.p3.shaketicket.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActShaketicketAward:奖项表<br>
 * @author pituo
 * @since：2015年12月24日 11时08分30秒 星期四 
 * @version:1.0
 */
public class WxActShaketicketAward implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	/**
	/**
	
	
	
	/**
	 *微信原始id
	 */
	private String jwidName;
	private String unit;
	/**
	 *创建人
	 */
	private String createBy;
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	public String getId() {
	
	
	public String getIsCard() {
		return isCard;
	}
	public void setIsCard(String isCard) {
		this.isCard = isCard;
	}


	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}


	/**
	 *数量
	 */
	private Integer amount;
	/**
	 *概率
	 */
	private Double probability;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Double getProbability() {
		return probability;
	}
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	private String awardsDescribe;
	public String getAwardsDescribe() {
		return awardsDescribe;
	}
	public void setAwardsDescribe(String awardsDescribe) {
		this.awardsDescribe = awardsDescribe;
	}
	
	
}
