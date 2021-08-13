	package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.AdminDetails;
import com.lti.mypack.model.Eligibility;
import com.lti.mypack.model.LoanDetails;
import com.lti.mypack.model.UserDetails;
import com.lti.mypack.model.VehicleDetails;

public interface LoanService{
	
	public List<UserDetails> getUserDetails();
	public boolean addUserDetails(UserDetails userdetails);
	public boolean updateUserDetails(UserDetails userdetails);
	public boolean deleteUserDetails(UserDetails userdetails);
	public UserDetails findUserDetails(int userid);
	public List<UserDetails> findUserDetailsByEmail(String Email);
	
	public List<VehicleDetails> getVehicleDetails();
	public boolean addVehicleDetails(VehicleDetails vehicledetails);
	public boolean updateVehicleDetails(VehicleDetails vehicledetails);
	public boolean deleteVehicleDetails(VehicleDetails vehicledetails);
	public VehicleDetails findVehicleDetails(int vehicleid);
	public List<VehicleDetails> findVehicleDetailsByVehicletype(String vehicletype);
	
	public List<LoanDetails> getLoanDetails();
	public boolean addLoanDetails(LoanDetails loandetails);
	public boolean updateLoanDetails(LoanDetails loandetails);
	public boolean deleteLoanDetails(LoanDetails loandetails);
	public LoanDetails findLoanDetails(int userid);
	public List<LoanDetails> findLoanDetailsByLoanamount(int loanamount);
	
	public List<Eligibility> getEligibility();
	public boolean addEligibility(Eligibility eligibility);
	public Eligibility findEligibility(int docid);
	
	public List<AdminDetails> getAdminDetails();
	public AdminDetails findAdminDetails(int aId);
	public boolean addAdminDetails(AdminDetails admindetails);
	public boolean updateAdminDetails(AdminDetails admindetails);
	public List<AdminDetails> findAdminDetailsByEmail(String email);
	//public AdminDetails findAdminDetails(String email);

	
	
	
	

}
