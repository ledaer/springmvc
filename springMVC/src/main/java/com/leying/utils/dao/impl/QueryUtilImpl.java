package com.leying.utils.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.leying.utils.dao.intf.QueryUtil;

@Repository
public class QueryUtilImpl implements QueryUtil {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Map<String, Object> getAll(String tableName) {
		String sql = "SELECT * From " + tableName;
		return this.jdbcTemplate.queryForMap(sql);
	}

}
