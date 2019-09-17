/*
 * 代码生成器自动生成的
 * Since 2008 - 2019
 *
 */
package cn.com.yusys.yusp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

import cn.com.yusys.yusp.commons.mapper.QueryModel;
import cn.com.yusys.yusp.domain.PdPledgeCate;
import cn.com.yusys.yusp.repository.mapper.PdPledgeCateMapper;
/**
 * @项目名称: danpaopin模块
 * @类名称: PdPledgeCateService
 * @类描述: #服务类
 * @功能描述: 
 * @创建人: Administrator
 * @创建时间: 2019-09-12 11:19:09
 * @修改备注: 
 * @修改记录: 修改时间    修改人员    修改原因
 * -------------------------------------------------------------
 * @version 1.0.0
 * @Copyright (c) 宇信科技-版权所有
 */
@Service
@Transactional
public class PdPledgeCateService {

    @Autowired
    private PdPledgeCateMapper pdPledgeCateMapper;
	
    /**
     * @方法名称: selectByPrimaryKey
     * @方法描述: 根据主键查询
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public PdPledgeCate selectByPrimaryKey(Integer pledgeCateId) {
        return pdPledgeCateMapper.selectByPrimaryKey(pledgeCateId);
    }
	
	/**
     * @方法名称: selectAll
     * @方法描述: 查询所有数据
     * @参数与返回说明: 
     * @算法描述: 无
     */
    @Transactional(readOnly=true)
    public List<PdPledgeCate> selectAll(QueryModel model) {
        List<PdPledgeCate> records = (List<PdPledgeCate>) pdPledgeCateMapper.selectByModel(model);
        return records;
    }

    /**
     * @方法名称: selectByModel
     * @方法描述: 条件查询 - 查询进行分页
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public List<PdPledgeCate> selectByModel(QueryModel model) {
        PageHelper.startPage(model.getPage(), model.getSize());
        List<PdPledgeCate> list = pdPledgeCateMapper.selectByModel(model);
        PageHelper.clearPage();
        return list;
    }	
	
    /**
     * @方法名称: insert
     * @方法描述: 插入
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int insert(PdPledgeCate record) {
        return pdPledgeCateMapper.insert(record);
    }

    /**
     * @方法名称: insertSelective
     * @方法描述: 插入 - 只插入非空字段
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int insertSelective(PdPledgeCate record) {
        return pdPledgeCateMapper.insertSelective(record);
    }

    /**
     * @方法名称: update
     * @方法描述: 根据主键更新 
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int update(PdPledgeCate record) {
        return pdPledgeCateMapper.updateByPrimaryKey(record);
    }

    /**
     * @方法名称: updateSelective
     * @方法描述: 根据主键更新 - 只更新非空字段
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int updateSelective(PdPledgeCate record) {
        return pdPledgeCateMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * @方法名称: deleteByPrimaryKey
     * @方法描述: 根据主键删除
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int deleteByPrimaryKey(Integer pledgeCateId) {
        return pdPledgeCateMapper.deleteByPrimaryKey(pledgeCateId);
    }

    /**
     * @方法名称: deleteByIds
     * @方法描述: 根据多个主键删除
     * @参数与返回说明: 
     * @算法描述: 无
     */
    public int deleteByIds(String ids) {
        return pdPledgeCateMapper.deleteByIds(ids);
    }
}
