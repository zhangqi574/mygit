/*
 * 代码生成器自动生成的
 * Since 2008 - 2019
 *
 */
package cn.com.yusys.yusp.repository.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import cn.com.yusys.yusp.domain.PdPledgeCate;
import  cn.com.yusys.yusp.commons.mapper.QueryModel;
/**
 * @项目名称: danpaopin模块
 * @类名称: PdPledgeCateMapper
 * @类描述: #Dao类
 * @功能描述: 
 * @创建人: Administrator
 * @创建时间: 2019-09-12 11:19:09
 * @修改备注: 
 * @修改记录: 修改时间    修改人员    修改原因
 * -------------------------------------------------------------
 * @version 1.0.0
 * @Copyright (c) 宇信科技-版权所有
 */
public interface PdPledgeCateMapper {

    /**
     * @方法名称: selectByPrimaryKey
     * @方法描述: 根据主键查询
     * @参数与返回说明: 
     * @算法描述: 无
     */
    PdPledgeCate selectByPrimaryKey(@Param("pledgeCateId") Integer pledgeCateId);

    /**
     * @方法名称: selectByModel
     * @方法描述: 条件列表查询
     * @参数与返回说明: 
     * @算法描述: 无
     */
    List<PdPledgeCate> selectByModel(QueryModel model);
	
    /**
     * @方法名称: insert
     * @方法描述: 插入
     * @参数与返回说明:
     * @算法描述: 无
     */
    int insert(PdPledgeCate record);

    /**
     * @方法名称: insertSelective
     * @方法描述: 插入 - 只插入非空字段
     * @参数与返回说明: 
     * @算法描述: 无
     */
    int insertSelective(PdPledgeCate record);

    /**
     * @方法名称: updateByPrimaryKey
     * @方法描述: 根据主键更新 
     * @参数与返回说明: 
     * @算法描述: 无
     */
    int updateByPrimaryKey(PdPledgeCate record);

    /**
     * @方法名称: updateByPrimaryKeySelective
     * @方法描述: 根据主键更新 - 只更新非空字段
     * @参数与返回说明: 
     * @算法描述: 无
     */
    int updateByPrimaryKeySelective(PdPledgeCate record);

    /**
     * @方法名称: deleteByPrimaryKey
     * @方法描述: 根据主键删除
     * @参数与返回说明: sysId - 主键
     * @算法描述: 无
     */
    int deleteByPrimaryKey(@Param("pledgeCateId") Integer pledgeCateId);

    /**
     * @方法名称: deleteByIds
     * @方法描述: 根据多个主键删除
     * @参数与返回说明: 
     * @算法描述: 无
     */
    int deleteByIds(@Param("ids")String ids);
   
}