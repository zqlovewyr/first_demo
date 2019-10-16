package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysUserDO;
import com.qy.first_demo.entity.po.SysUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDAO {
    long countByExample(SysUserDOExample example);

    int deleteByExample(SysUserDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysUserDO record);

    int insertSelective(SysUserDO record);

    List<SysUserDO> selectByExample(SysUserDOExample example);

    SysUserDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysUserDO record, @Param("example") SysUserDOExample example);

    int updateByExample(@Param("record") SysUserDO record, @Param("example") SysUserDOExample example);

    int updateByPrimaryKeySelective(SysUserDO record);

    int updateByPrimaryKey(SysUserDO record);
}