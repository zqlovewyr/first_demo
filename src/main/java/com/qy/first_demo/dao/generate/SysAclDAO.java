package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysAclDO;
import com.qy.first_demo.entity.po.SysAclDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAclDAO {
    long countByExample(SysAclDOExample example);

    int deleteByExample(SysAclDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAclDO record);

    int insertSelective(SysAclDO record);

    List<SysAclDO> selectByExample(SysAclDOExample example);

    SysAclDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAclDO record, @Param("example") SysAclDOExample example);

    int updateByExample(@Param("record") SysAclDO record, @Param("example") SysAclDOExample example);

    int updateByPrimaryKeySelective(SysAclDO record);

    int updateByPrimaryKey(SysAclDO record);
}