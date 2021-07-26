package javaSpringjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import javaSpringjdbc.Entity.User;

public class RowMapperImp implements RowMapper<User>{
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
	}
}
