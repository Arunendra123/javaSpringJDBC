package javaSpringjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javaSpringjdbc.Entity.User;

public class UserService implements UserDao{

	private JdbcTemplate jdbcTemplate;
	
	UserService(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int insert(User user) {
		String sql="insert into springjdbc(id,firstName,surName,DOB,tile) values(?,?,?,?,?)";
    	jdbcTemplate.update(sql,user.getId(),user.getFirstName(),user.getSurName(),user.getDOB(),user.getTile());
		return 0;
	}

	public int update(User user) {
		String sql="update springjdbc set firstName=?, surName=?,DOB=?,tile=? where id=?";
		jdbcTemplate.update(sql,user.getFirstName(),user.getSurName(),user.getDOB(),user.getTile(),user.getId());
		return 0;
	}

	public int delete(User user) {
		String sql="delete springjdbc where id=?";
		jdbcTemplate.update(sql,user.getId());
		return 0;
	}

	public User getUser(int userId) {
		String sql="select * from springjdbc where id=?";
		RowMapper<User> rowMapper=new RowMapperImp();
		return jdbcTemplate.queryForObject(sql,rowMapper,userId);
	}

	public List<User> listUser() {
		String sql="select * from springjdbc";
		RowMapper<User> rowMapper=new RowMapperImp();
		return jdbcTemplate.query(sql,rowMapper);
	}
	
}
