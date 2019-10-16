package com.qy.first_demo.dao.generate;

import com.qy.first_demo.entity.po.SysLogDO;
import com.qy.first_demo.entity.po.SysLogDOExample;
import com.qy.first_demo.entity.po.SysLogDOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogDAO {
    long countByExample(SysLogDOExample example);

    int deleteByExample(SysLogDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLogDOWithBLOBs record);

    int insertSelective(SysLogDOWithBLOBs record);

    List<SysLogDOWithBLOBs> selectByExampleWithBLOBs(SysLogDOExample example);

    List<SysLogDO> selectByExample(SysLogDOExample example);

    SysLogDOWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLogDOWithBLOBs record, @Param("example") SysLogDOExample example);

    int updateByExampleWithBLOBs(@Param("record") SysLogDOWithBLOBs record, @Param("example") SysLogDOExample example);

    int updateByExample(@Param("record") SysLogDO record, @Param("example") SysLogDOExample example);

    int updateByPrimaryKeySelective(SysLogDOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogDOWithBLOBs record);

    int updateByPrimaryKey(SysLogDO record);
}