package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysRoleDO;
import com.qy.first_demo.entity.po.SysRoleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDAO {
    long countByExample(SysRoleDOExample example);

    int deleteByExample(SysRoleDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleDO record);

    int insertSelective(SysRoleDO record);

    List<SysRoleDO> selectByExample(SysRoleDOExample example);

    SysRoleDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleDO record, @Param("example") SysRoleDOExample example);

    int updateByExample(@Param("record") SysRoleDO record, @Param("example") SysRoleDOExample example);

    int updateByPrimaryKeySelective(SysRoleDO record);

    int updateByPrimaryKey(SysRoleDO record);
}