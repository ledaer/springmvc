package com.sgnbs.system.basic.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sgnbs.system.basic.dao.intf.AdminDAO;
import com.sgnbs.system.basic.dao.rowMap.AdminRowMap;
import com.sgnbs.system.basic.model.po.MAdmin;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	protected AdminRowMap adminRowMap = new AdminRowMap();

	@Override
	public MAdmin read(String username){
		String sql = "SELECT * From madmin WHERE username = ?";
		return (MAdmin) this.jdbcTemplate.queryForObject(sql,
				new Object[] { username }, adminRowMap);
	}

	@Override
	public MAdmin read(int id) {
		String sql = "SELECT * From madmin WHERE id = ?";
		return (MAdmin) this.jdbcTemplate.queryForObject(sql,
				new Object[] { id }, adminRowMap);
	}

	@Override
	public Boolean save(MAdmin madmin) {
		String sql = "insert into madmin(id,username,password,birthday,email) values(?,?,?,?,?)";
		Object obj[] = { madmin.getId(), madmin.getUsername(),
				madmin.getPassword(), madmin.getBirthday(), madmin.getEmail() };
		int temp = this.jdbcTemplate.update(sql, obj);
		if (temp > 0) {
			System.out.println("save success");
			return true;
		} else {
			System.out.println("save fail");
			return false;
		}
	}

}
