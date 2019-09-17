/*
 * 代码生成器自动生成的
 * Since 2008 - 2019
 *
 */
package cn.com.yusys.yusp.domain;
import cn.com.yusys.yusp.commons.mapper.domain.BaseDomain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * @项目名称: danpaopin模块
 * @类名称: PdPledgeCate
 * @类描述: pd_pledge_cate数据实体类
 * @功能描述: 
 * @创建人: Administrator
 * @创建时间: 2019-09-12 11:19:09
 * @修改备注: 
 * @修改记录: 修改时间    修改人员    修改原因
 * -------------------------------------------------------------
 * @version 1.0.0
 * @Copyright (c) 宇信科技-版权所有
 */
@Table(name = "pd_pledge_cate")
public class PdPledgeCate extends BaseDomain implements Serializable {
    private static final long serialVersionUID = 1L;
	
	/** 主键 **/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "PLEDGE_CATE_ID")
	private Integer pledgeCateId;
	
	/** 押品类型代码 **/
	@Column(name = "PLEDGE_CATE_CODE", unique = false, nullable = false, length = 20)
	private String pledgeCateCode;
	
	/** 父级类型代码 **/
	@Column(name = "PARENT_CODE", unique = false, nullable = true, length = 20)
	private String parentCode;
	
	/** 层次级别 **/
	@Column(name = "LVL_CODE", unique = false, nullable = true, length = 10)
	private Integer lvlCode;
	
	/** 分类显示顺序 **/
	@Column(name = "CATE_SHOW_NO", unique = false, nullable = true, length = 10)
	private Integer cateShowNo;
	
	/** 分类有效状态 **/
	@Column(name = "CATE_VALID_FLAG", unique = false, nullable = true, length = 10)
	private Integer cateValidFlag;
	
	/** 押品类型名称 **/
	@Column(name = "PLEDGE_CATE_NAME", unique = false, nullable = true, length = 100)
	private String pledgeCateName;
	
	/** 押品类型SEQ **/
	@Column(name = "CATE_SEQ_NO", unique = false, nullable = true, length = 100)
	private String cateSeqNo;
	
	/** 抵质押标识 **/
	@Column(name = "PLEDGE_FLAG", unique = false, nullable = true, length = 10)
	private Integer pledgeFlag;
	
	/** 押品类别 **/
	@Column(name = "PLEDGE_TYPE_ID", unique = false, nullable = true, length = 10)
	private Integer pledgeTypeId;
	
	/** 父级类型名称 **/
	@Column(name = "PARENT_TYPE_NAME", unique = false, nullable = true, length = 100)
	private String parentTypeName;
	
	/** 创建人 **/
	@Column(name = "CREATOR_ID", unique = false, nullable = true, length = 20)
	private String creatorId;
	
	/** 创建人机构 **/
	@Column(name = "CREATE_ORG_ID", unique = false, nullable = true, length = 30)
	private String createOrgId;
	
	/** 创建时间 **/
	@Column(name = "CREATE_TIME", unique = false, nullable = true, length = 14)
	private String createTime;
	
	/** 最后修改人 **/
	@Column(name = "RECENT_REVISER_ID", unique = false, nullable = true, length = 20)
	private String recentReviserId;
	
	/** 最后修改人机构 **/
	@Column(name = "RECENT_REVISE_ORG_ID", unique = false, nullable = true, length = 30)
	private String recentReviseOrgId;
	
	/** 最后修改时间 **/
	@Column(name = "RECENT_REVISE_TIME", unique = false, nullable = true, length = 14)
	private String recentReviseTime;
	
	/** 最高纸质质押率 **/
	@Column(name = "HIGH_PLEDGE_RATE", unique = false, nullable = true, length = 10)
	private java.math.BigDecimal highPledgeRate;
	
	/** 重估评率 **/
	@Column(name = "ASSESS_FREQ", unique = false, nullable = true, length = 2)
	private String assessFreq;
	
	/** 超期提醒周期 **/
	@Column(name = "OVERDUE_CYCLE", unique = false, nullable = true, length = 5)
	private Integer overdueCycle;
	
	/** 超期提醒次数 **/
	@Column(name = "OVERDUE_NUMS", unique = false, nullable = true, length = 3)
	private Short overdueNums;
	
	
	/**
	 * @param pledgeCateId
	 */
	public void setPledgeCateId(Integer pledgeCateId) {
		this.pledgeCateId = pledgeCateId;
	}
	
    /**
     * @return pledgeCateId
     */
	public Integer getPledgeCateId() {
		return this.pledgeCateId;
	}
	
	/**
	 * @param pledgeCateCode
	 */
	public void setPledgeCateCode(String pledgeCateCode) {
		this.pledgeCateCode = pledgeCateCode;
	}
	
    /**
     * @return pledgeCateCode
     */
	public String getPledgeCateCode() {
		return this.pledgeCateCode;
	}
	
	/**
	 * @param parentCode
	 */
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	
    /**
     * @return parentCode
     */
	public String getParentCode() {
		return this.parentCode;
	}
	
	/**
	 * @param lvlCode
	 */
	public void setLvlCode(Integer lvlCode) {
		this.lvlCode = lvlCode;
	}
	
    /**
     * @return lvlCode
     */
	public Integer getLvlCode() {
		return this.lvlCode;
	}
	
	/**
	 * @param cateShowNo
	 */
	public void setCateShowNo(Integer cateShowNo) {
		this.cateShowNo = cateShowNo;
	}
	
    /**
     * @return cateShowNo
     */
	public Integer getCateShowNo() {
		return this.cateShowNo;
	}
	
	/**
	 * @param cateValidFlag
	 */
	public void setCateValidFlag(Integer cateValidFlag) {
		this.cateValidFlag = cateValidFlag;
	}
	
    /**
     * @return cateValidFlag
     */
	public Integer getCateValidFlag() {
		return this.cateValidFlag;
	}
	
	/**
	 * @param pledgeCateName
	 */
	public void setPledgeCateName(String pledgeCateName) {
		this.pledgeCateName = pledgeCateName;
	}
	
    /**
     * @return pledgeCateName
     */
	public String getPledgeCateName() {
		return this.pledgeCateName;
	}
	
	/**
	 * @param cateSeqNo
	 */
	public void setCateSeqNo(String cateSeqNo) {
		this.cateSeqNo = cateSeqNo;
	}
	
    /**
     * @return cateSeqNo
     */
	public String getCateSeqNo() {
		return this.cateSeqNo;
	}
	
	/**
	 * @param pledgeFlag
	 */
	public void setPledgeFlag(Integer pledgeFlag) {
		this.pledgeFlag = pledgeFlag;
	}
	
    /**
     * @return pledgeFlag
     */
	public Integer getPledgeFlag() {
		return this.pledgeFlag;
	}
	
	/**
	 * @param pledgeTypeId
	 */
	public void setPledgeTypeId(Integer pledgeTypeId) {
		this.pledgeTypeId = pledgeTypeId;
	}
	
    /**
     * @return pledgeTypeId
     */
	public Integer getPledgeTypeId() {
		return this.pledgeTypeId;
	}
	
	/**
	 * @param parentTypeName
	 */
	public void setParentTypeName(String parentTypeName) {
		this.parentTypeName = parentTypeName;
	}
	
    /**
     * @return parentTypeName
     */
	public String getParentTypeName() {
		return this.parentTypeName;
	}
	
	/**
	 * @param creatorId
	 */
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	
    /**
     * @return creatorId
     */
	public String getCreatorId() {
		return this.creatorId;
	}
	
	/**
	 * @param createOrgId
	 */
	public void setCreateOrgId(String createOrgId) {
		this.createOrgId = createOrgId;
	}
	
    /**
     * @return createOrgId
     */
	public String getCreateOrgId() {
		return this.createOrgId;
	}
	
	/**
	 * @param createTime
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
    /**
     * @return createTime
     */
	public String getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * @param recentReviserId
	 */
	public void setRecentReviserId(String recentReviserId) {
		this.recentReviserId = recentReviserId;
	}
	
    /**
     * @return recentReviserId
     */
	public String getRecentReviserId() {
		return this.recentReviserId;
	}
	
	/**
	 * @param recentReviseOrgId
	 */
	public void setRecentReviseOrgId(String recentReviseOrgId) {
		this.recentReviseOrgId = recentReviseOrgId;
	}
	
    /**
     * @return recentReviseOrgId
     */
	public String getRecentReviseOrgId() {
		return this.recentReviseOrgId;
	}
	
	/**
	 * @param recentReviseTime
	 */
	public void setRecentReviseTime(String recentReviseTime) {
		this.recentReviseTime = recentReviseTime;
	}
	
    /**
     * @return recentReviseTime
     */
	public String getRecentReviseTime() {
		return this.recentReviseTime;
	}
	
	/**
	 * @param highPledgeRate
	 */
	public void setHighPledgeRate(java.math.BigDecimal highPledgeRate) {
		this.highPledgeRate = highPledgeRate;
	}
	
    /**
     * @return highPledgeRate
     */
	public java.math.BigDecimal getHighPledgeRate() {
		return this.highPledgeRate;
	}
	
	/**
	 * @param assessFreq
	 */
	public void setAssessFreq(String assessFreq) {
		this.assessFreq = assessFreq;
	}
	
    /**
     * @return assessFreq
     */
	public String getAssessFreq() {
		return this.assessFreq;
	}
	
	/**
	 * @param overdueCycle
	 */
	public void setOverdueCycle(Integer overdueCycle) {
		this.overdueCycle = overdueCycle;
	}
	
    /**
     * @return overdueCycle
     */
	public Integer getOverdueCycle() {
		return this.overdueCycle;
	}
	
	/**
	 * @param overdueNums
	 */
	public void setOverdueNums(Short overdueNums) {
		this.overdueNums = overdueNums;
	}
	
    /**
     * @return overdueNums
     */
	public Short getOverdueNums() {
		return this.overdueNums;
	}


}