package com.cts.app.dao;

import java.util.List;

import com.cts.app.entity.Donor;

public interface DonorDao {
	public boolean DonateBlood(Donor donor);
	public List<Donor> getAllDonors();
	public List<Donor> search(String bloodGroup);
	public boolean deleteDonor(int id);
}
