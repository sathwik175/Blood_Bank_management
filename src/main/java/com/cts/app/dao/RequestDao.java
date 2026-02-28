package com.cts.app.dao;

import java.util.List;


import com.cts.app.entity.Request;

public interface RequestDao {
	public boolean makerequest(Request request);
	public List<Request> history(int userid);
	public List<Request> getAllRequests();
	public boolean deleteRequest(int id);
	public boolean changeStatus(String status,int id);
}
