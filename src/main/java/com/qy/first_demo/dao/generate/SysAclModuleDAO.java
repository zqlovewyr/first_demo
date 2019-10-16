package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysAclModuleDO;
import com.qy.first_demo.entity.po.SysAclModuleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAclModuleDAO {
    long countByExample(SysAclModuleDOExample example);

    int deleteByExample(SysAclModuleDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAclModuleDO record);

    int insertSelective(SysAclModuleDO record);

    List<SysAclModuleDO> selectByExample(SysAclModuleDOExample example);

    SysAclModuleDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAclModuleDO record, @Param("example") SysAclModuleDOExample example);

    int updateByExample(@Param("record") SysAclModuleDO record, @Param("example") SysAclModuleDOExample example);

    int updateByPrimaryKeySelective(SysAclModuleDO record);

    int updateByPrimaryKey(SysAclModuleDO record);
}