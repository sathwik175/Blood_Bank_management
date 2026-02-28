package com.cts.app.daoimpl;


import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.app.dao.BloodDetailsDao;
import com.cts.app.entity.BloodDetails;

public class BloodDetailsDaoImpl implements BloodDetailsDao{

	private static final String Addquery="insert into blood_details(bloodgroup,count,units) values(?,?,?)";
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public boolean addBloodDetails(BloodDetails bloodDetails) {
		int r=jdbcTemplate.update(Addquery,bloodDetails.getBloodgroup(),bloodDetails.getCount(),bloodDetails.getUnits());
		if(r>0) {
			return true;
		}
		else {
			return false;
		}
	}

	
    
}