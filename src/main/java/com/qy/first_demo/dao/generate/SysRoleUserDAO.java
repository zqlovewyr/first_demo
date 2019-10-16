package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysRoleUserDO;
import com.qy.first_demo.entity.po.SysRoleUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleUserDAO {
    long countByExample(SysRoleUserDOExample example);

    int deleteByExample(SysRoleUserDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUserDO record);

    int insertSelective(SysRoleUserDO record);

    List<SysRoleUserDO> selectByExample(SysRoleUserDOExample example);

    SysRoleUserDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleUserDO record, @Param("example") SysRoleUserDOExample example);

    int updateByExample(@Param("record") SysRoleUserDO record, @Param("example") SysRoleUserDOExample example);

    int updateByPrimaryKeySelective(SysRoleUserDO record);

    int updateByPrimaryKey(SysRoleUserDO record);
}