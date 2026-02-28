package com.cts.app.daoimpl;


import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.Rowmapper.DonorMapper;
import com.cts.app.dao.DonorDao;
import com.cts.app.entity.Donor;



public class DonorImpl implements DonorDao {
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean DonateBlood(Donor d) {
		boolean response = false;
		String sql = "insert into donor (name,bloodgroup,units,mobile,gender,age,city,address,date) values(?,?,?,?,?,?,?,?,?)";
		int res = jdbcTemplate.update(sql,d.getName(),d.getBloodGroup(),d.getUnits(),d.getMobile(),d.getGender(),d.getAge(),d.getCity(),d.getAddress(),d.getDate());
		response = (res > 0);
		return response;
	}

	@Override
	public List<Donor> getAllDonors() {
		// TODO Auto-generated method stub
		String sql="select * from donor";
		DonorMapper rowmapper = new DonorMapper();
		List<Donor> res=jdbcTemplate.query(sql,rowmapper);
		return res;
	}

	@Override
	public List<Donor> search(String bloodGroup) {
		// TODO Auto-generated method stub
		String sql = "select * from donor where bloodgroup=?";
		String bg=bloodGroup;
		DonorMapper rowmapper = new DonorMapper();
		@SuppressWarnings("deprecation")
		List<Donor> donorList = jdbcTemplate.query(sql, new Object[]{bg}, rowmapper);
		return donorList;
	}
	@Override
	public boolean deleteDonor(int id) {
		// TODO Auto-generated method stub
		boolean response=false;
		String sql="delete from donor where id=?";
		int res=jdbcTemplate.update(sql, id);
		response=(res>0);
		return response;
	}

}
