package com.sgnbs.system.basic.dao.rowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sgnbs.system.basic.model.po.MAdmin;

public class AdminRowMap implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		MAdmin mAdmin = new MAdmin();  
		mAdmin.setId(rs.getInt("id"));  
		mAdmin.setUsername(rs.getString("username"));  
		mAdmin.setPassword(rs.getString("password"));  
		mAdmin.setBirthday(rs.getDate("birthday"));  
		mAdmin.setEmail(rs.getString("email"));  
        return mAdmin;  
	}

}
