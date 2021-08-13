package com.lti.mypack.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.AdminDetails;
import com.lti.mypack.model.Eligibility;
import com.lti.mypack.model.LoanDetails;
import com.lti.mypack.model.UserDetails;
import com.lti.mypack.model.VehicleDetails;
import com.lti.mypack.repository.AdminDetailsRepository;
import com.lti.mypack.repository.EligibilityRepository;
import com.lti.mypack.repository.LoanDetailsRepository;
import com.lti.mypack.repository.UserDetailsRepository;
import com.lti.mypack.repository.VehicleDetailsRepository;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

	@Autowired
	UserDetailsRepository userDetails;
	@Autowired
	VehicleDetailsRepository vehicleDetails;
	@Autowired
	LoanDetailsRepository loanDetails;
	@Autowired
	EligibilityRepository elig;
	@Autowired
	AdminDetailsRepository adminDetails;
	
	@Override
	public List<UserDetails> getUserDetails() {
		return userDetails.findAll();
	}

	@Override
	public boolean addUserDetails(UserDetails userdetails) {
		userDetails.save(userdetails);
		return true;
	}

	@Override
	public boolean updateUserDetails(UserDetails userdetails) {
		UserDetails user=userDetails.findById(userdetails.getUid()).get();
		user=userdetails;
		userDetails.save(user);
		return true;
	}

	@Override
	public boolean deleteUserDetails(UserDetails userdetails) {
		userDetails.delete(userdetails);
		return true;
	}

	@Override
	public UserDetails findUserDetails(int userid) {
		return userDetails.findById(userid).get();
	}

	@Override
	public List<UserDetails> findUserDetailsByEmail(String Email) {
		return userDetails.findByEmail(Email);
	}

	@Override
	public List<VehicleDetails> getVehicleDetails() {
		return vehicleDetails.findAll();
	}

	@Override
	public boolean addVehicleDetails(VehicleDetails vehicledetails) {
		vehicleDetails.save(vehicledetails);
		return true;
	}

	@Override
	public boolean updateVehicleDetails(VehicleDetails vehicledetails) {
		VehicleDetails veh=vehicleDetails.findById(vehicledetails.getVehid()).get();
		veh=vehicledetails;
		vehicleDetails.save(veh);
		return true;
	}

	@Override
	public boolean deleteVehicleDetails(VehicleDetails vehicledetails) {
		vehicleDetails.delete(vehicledetails);
		return true;
	}

	@Override
	public VehicleDetails findVehicleDetails(int vehid) {
		return vehicleDetails.findById(vehid).get();
	}

	@Override
	public List<VehicleDetails> findVehicleDetailsByVehicletype(String vehicletype) {
		return vehicleDetails.findByVehicletype(vehicletype);
	}

	@Override
	public List<LoanDetails> getLoanDetails() {
		return loanDetails.findAll();
	}

	@Override
	public boolean addLoanDetails(LoanDetails loandetails) {
		loanDetails.save(loandetails);
		return true;
	}

	@Override
	public boolean updateLoanDetails(LoanDetails loandetails) {
		LoanDetails loan=loanDetails.findById(loandetails.getLid()).get();
		loan=loandetails;
		loanDetails.save(loan);
		return true;
	}

	@Override
	public boolean deleteLoanDetails(LoanDetails loandetails) {
		loanDetails.delete(loandetails);
		return true;
	}

	@Override
	public LoanDetails findLoanDetails(int lid) {
		return loanDetails.findById(lid).get();
	}

	@Override
	public List<LoanDetails> findLoanDetailsByLoanamount(int loanamount) {
		return loanDetails.findByLoanamount(loanamount);
	}

	@Override
	public List<Eligibility> getEligibility() {
		return elig.findAll();
	}

	@Override
	public boolean addEligibility(Eligibility eligibility) {
		elig.save(eligibility);
		return true;
	}

	@Override
	public Eligibility findEligibility(int docid) {
		return elig.findById(docid).get();
	}

	@Override
	public List<AdminDetails> getAdminDetails() {
		return adminDetails.findAll();
	}

	@Override
	public boolean addAdminDetails(AdminDetails admindetails) {
		adminDetails.save(admindetails);
		return true;
	}

	@Override
	public AdminDetails findAdminDetails(int aId) {
		return adminDetails.findById(aId).get();
	}
	
	@Override
	public List<AdminDetails> findAdminDetailsByEmail(String email) {
		return adminDetails.findByEmail(email);
	}

	@Override
	public boolean updateAdminDetails(AdminDetails admindetails) {
		AdminDetails admin=adminDetails.findById(admindetails.getaId()).get();
		admin=admindetails;
		adminDetails.save(admin);
		return true;
	}

	
	
	
//	@Override
//	public AdminDetails findAdminDetails(String email) {
//		return adminDetails.getByEmail(email);
//	}
//	UserDetails user=userDetails.updateUserDetailsByName(userdetails.getFirstname()).get();
//	user=userdetails;
//	userDetails.save(user);
//	return true;
	
	

}
