package com.qy.first_demo.dao.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("sqlSessionTemplateDao")
public class SqlSessionTemplateDao implements BaseDAO  {
	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Object findOne(String invokeMethodName, Map<String, Object> map) {
		return sqlSessionTemplate.selectOne(invokeMethodName, map);
	}

	@Override
	public Object findOne(String invokeMethodName) {
		return sqlSessionTemplate.selectOne(invokeMethodName);
	}

	@Override
	public List<List<Object>> findListByBatchTableName(String invokeMethodName, List<String> tablenames,
			Map<String, Object> map) {
		List<List<Object>> result = new ArrayList<List<Object>>();
		for (Object o : tablenames) {
			map.put("tablename", o.toString());
			result.add((List<Object>) sqlSessionTemplate.selectList(invokeMethodName, map));
		}
		return result;
	}

	@Override
	public Object findList(String invokeMethodName, Map<String, Object> map) {
		return sqlSessionTemplate.selectList(invokeMethodName, map);
	}
	
	@Override
	public Object findList(String invokeMethodName, Object param) {
		return sqlSessionTemplate.selectList(invokeMethodName, param);
	}

	@Override
	public void insertOne(String invokeMethodName, Map<String, Object> map) {
		sqlSessionTemplate.insert(invokeMethodName, map);
	}

	@Override
	public void insertOne(String invokeMethodName, Object obj) {
		sqlSessionTemplate.insert(invokeMethodName, obj);
	}

	@Override
	public void updateOne(String invokeMethodName, Object obj) {
		sqlSessionTemplate.update(invokeMethodName, obj);
	}

	@Override
	public void deleteOne(String invokeMethodName, Object obj) {
		sqlSessionTemplate.delete(invokeMethodName, obj);
	}

	@Override
	public Object findList(String invokeMethodName) {
		return sqlSessionTemplate.selectList(invokeMethodName);
	}
}
