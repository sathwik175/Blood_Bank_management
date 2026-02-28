package com.cts.app.daoimpl;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;


import com.cts.app.Rowmapper.UserRowMapper;
import com.cts.app.dao.UserDao;
import com.cts.app.entity.User;


public class UserImpl implements UserDao{
	
	private static final String Addquery = "INSERT INTO USERS(email,username,mobile,bloodgroup,gender,age,password) VALUES(?,?,?,?,?,?,?)";
	private static final String Updatequery="UPDATE USERS SET email=?,username=?,mobile=?,bloodgroup=?,gender=?,age=?,password=? WHERE ID=?";
	
    
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {return jdbcTemplate;}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

	public boolean addUser(User user) {
		int r=jdbcTemplate.update(Addquery,user.getEmail(),user.getUsername(),user.getMobile(),user.getBloodgroup(),user.getGender(),user.getAge(),user.getPassword());
		if(r>0) {return true;}
		else {return false;}
	}

	
	public boolean updateUser(User user) {
		int r=jdbcTemplate.update(Updatequery,user.getEmail(),user.getUsername(),user.getMobile(),user.getBloodgroup(),user.getGender(),user.getAge(),user.getPassword(),user.getId());
		if(r>0) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("deprecation")
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM users WHERE email = ?";
		    try {
		        return jdbcTemplate.queryForObject(sql, new Object[]{email}, new UserRowMapper());
		    } catch (EmptyResultDataAccessException e) {
		        return null;
		    }
	}

	
	
}