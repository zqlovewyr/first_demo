package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysDeptDO;
import com.qy.first_demo.entity.po.SysDeptDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDeptDAO {
    long countByExample(SysDeptDOExample example);

    int deleteByExample(SysDeptDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysDeptDO record);

    int insertSelective(SysDeptDO record);

    List<SysDeptDO> selectByExample(SysDeptDOExample example);

    SysDeptDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysDeptDO record, @Param("example") SysDeptDOExample example);

    int updateByExample(@Param("record") SysDeptDO record, @Param("example") SysDeptDOExample example);

    int updateByPrimaryKeySelective(SysDeptDO record);

    int updateByPrimaryKey(SysDeptDO record);
}