package com.qy.first_demo.dao.base;

import java.util.List;
import java.util.Map;

public interface BaseDAO {
	public abstract Object findOne(String invokeMethodName, Map<String, Object> map);

	/**
	 * 自定义多表查询
	 * <p>
	 * Title: findListByBatchTableName
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param invokeMethodName
	 *            查询方法名
	 * @param tablenames
	 *            要查询数据的表名
	 * @param map
	 *            查询参数
	 * @return
	 */
	public abstract List<List<Object>> findListByBatchTableName(String invokeMethodName, List<String> tablenames,
                                                                Map<String, Object> map);

	public abstract Object findOne(String invokeMethodName);

	public abstract Object findList(String invokeMethodName, Map<String, Object> map);

	public abstract Object findList(String invokeMethodName);
	
	public abstract Object findList(String invokeMethodName, Object param);

	public abstract void insertOne(String invokeMethodName, Map<String, Object> map);

	public abstract void updateOne(String invokeMethodName, Object obj);

	public abstract void deleteOne(String invokeMethodName, Object obj);

	public abstract void insertOne(String invokeMethodName, Object obj);
}
