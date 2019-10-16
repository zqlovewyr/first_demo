package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysRoleAclDO;
import com.qy.first_demo.entity.po.SysRoleAclDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAclDAO {
    long countByExample(SysRoleAclDOExample example);

    int deleteByExample(SysRoleAclDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleAclDO record);

    int insertSelective(SysRoleAclDO record);

    List<SysRoleAclDO> selectByExample(SysRoleAclDOExample example);

    SysRoleAclDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleAclDO record, @Param("example") SysRoleAclDOExample example);

    int updateByExample(@Param("record") SysRoleAclDO record, @Param("example") SysRoleAclDOExample example);

    int updateByPrimaryKeySelective(SysRoleAclDO record);

    int updateByPrimaryKey(SysRoleAclDO record);
}