package com.cts.app.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.Rowmapper.RequestRowMapper;
import com.cts.app.dao.RequestDao;
import com.cts.app.entity.Request;

public class RequestDaoImpl implements RequestDao {
	
	private static final String Addquery="Insert into request (name,email,bloodgroup,units,disease,mobile,gender,age,user_id) values(?,?,?,?,?,?,?,?,?)"; 
	private static final String SQL_GET_ALL="Select * from request ";
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {return jdbcTemplate;}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}
	
	@Override
	public boolean makerequest(Request request) {
		int r=jdbcTemplate.update(Addquery,request.getName(),request.getEmail(),request.getBloodgroup(),request.getUnits(),request.getDisease(),request.getMobile(),request.getGender(),request.getAge(),request.getUser_id());
		if(r>0) {return true;}
		else {return false;}
	}

	@Override
	public List<Request> history(int userid) {
		// TODO Auto-generated method stub
		RequestRowMapper rowmapper=new RequestRowMapper();
		String sql="select * from request where user_id=?";
		@SuppressWarnings("deprecation")
		List<Request> res=jdbcTemplate.query(sql,new Object[]{userid},rowmapper);
		return res;

	}
	@Override
	public boolean deleteRequest(int id) {
		// TODO Auto-generated method stub
		boolean response=false;
		String sql="delete from request where id=?";
		int res=jdbcTemplate.update(sql, id);
		response=(res>0);
		return response;
	}
	@Override
	public boolean changeStatus(String status,int id) {
		// TODO Auto-generated method stub
		boolean response=false;
		String sql="update request set status=? where id=? ";
		int res=jdbcTemplate.update(sql,status,id);
		response=(res>0);
		return response;
	}
	@Override
	public List<Request> getAllRequests() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new RequestRowMapper());
	}
	
	
}
