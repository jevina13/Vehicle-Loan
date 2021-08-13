package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.AdminDetails;
import com.lti.mypack.model.Eligibility;
import com.lti.mypack.model.LoanDetails;
import com.lti.mypack.model.UserDetails;
import com.lti.mypack.model.VehicleDetails;
import com.lti.mypack.service.LoanService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/loanRest/api")
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@GetMapping("/UserDetails")
	public List<UserDetails> getAll()
	{
		return loanService.getUserDetails();
	}
	@GetMapping("/UserDetails/{uid}")
	public UserDetails getUserDetailsById(@PathVariable(value="uid")int uid)
		{
			return loanService.findUserDetails(uid);
		}
	@GetMapping("/UserDetailsbymail/{email}")
	public List<UserDetails> getUserDetailsByEmail(@PathVariable(value="email")String email)
		{
			return loanService.findUserDetailsByEmail(email);
		}
	
	@PutMapping("/UserDetails")
	public boolean updateUserDetails(@RequestBody UserDetails userdetails)
	{
		System.out.println(userdetails);
		return loanService.updateUserDetails(userdetails);
	}
	
	
	
	@DeleteMapping("/UserDetails")
	public boolean deleteUserDetails(@RequestBody UserDetails userdetails)
	{
		return loanService.deleteUserDetails(userdetails);
	}
	@PostMapping("/UserDetails")
	public boolean addUserDetails(@RequestBody UserDetails userdetails)
	{
		return loanService.addUserDetails(userdetails);
	}
	
	
	
	
	@GetMapping("/VehicleDetails")
	public List<VehicleDetails> getAll1()
	{
		return loanService.getVehicleDetails();
	}
	@GetMapping("/VehicleDetails/{vehid}")
	public VehicleDetails getVehicleDetailsById(@PathVariable(value="vehid")int vehid)
		{
			return loanService.findVehicleDetails(vehid);
		}
	@GetMapping("/VehicleDetailsbytype/{email}")
	public List<VehicleDetails> getVehicleDetailsByVehicletype(@PathVariable(value="vehicletype")String vehicletype)
		{
			return loanService.findVehicleDetailsByVehicletype(vehicletype);
		}
	@PutMapping("/VehicleDetails")
	public boolean updateVehicleDetails(@RequestBody VehicleDetails vehicledetails)
	{
		return loanService.updateVehicleDetails(vehicledetails);
	}
	@DeleteMapping("/VehicleDetails")
	public boolean deleteVehicleDetails(@RequestBody VehicleDetails vehicledetails)
	{
		return loanService.deleteVehicleDetails(vehicledetails);
	}
	@PostMapping("/VehicleDetails")
	public boolean addVehicleDetails(@RequestBody VehicleDetails vehicledetails)
	{
		return loanService.addVehicleDetails(vehicledetails);
	}

	
	
	
	@GetMapping("/LoanDetails")
	public List<LoanDetails> getAll2()
	{
		return loanService.getLoanDetails();
	}
	@GetMapping("/LoanDetails/{lid}")
	public LoanDetails getLoanDetailsById(@PathVariable(value="lid")int lid)
		{
			return loanService.findLoanDetails(lid);
		}
	@GetMapping("/LoanDetailsbyname/{loanamount}")
	public List<LoanDetails> getLoanDetailsByLoanamount(@PathVariable(value="loanamount")int loanamount)
		{
			return loanService.findLoanDetailsByLoanamount(loanamount);
		}
	@PutMapping("/LoanDetails")
	public boolean updateLoanDetails(@RequestBody LoanDetails loandetails)
	{
		return loanService.updateLoanDetails(loandetails);
	}
	
	
	@DeleteMapping("/LoanDetails")
	public boolean deleteLoanDetails(@RequestBody LoanDetails loandetails)
	{
		return loanService.deleteLoanDetails(loandetails);
	}
	@PostMapping("/LoanDetails")
	public boolean addLoanDetails(@RequestBody LoanDetails loandetails)
	{
		return loanService.addLoanDetails(loandetails);
	}
	

	
	@GetMapping("/Eligibility")
	public List<Eligibility> getAll3()
	{
		return loanService.getEligibility();
	}
	@GetMapping("/Eligibility/{docid}")
	public Eligibility getEligibilityById(@PathVariable(value="docid")int docid)
		{
			return loanService.findEligibility(docid);
		}
	@PostMapping("/Eligibility")
	public boolean Eligibility(@RequestBody Eligibility eligibility)
	{
		return loanService.addEligibility(eligibility);
	}
	
	
	
	@GetMapping("/AdminDetails")
	public List<AdminDetails> getAll4(){
		return loanService.getAdminDetails();
	}
	
	@GetMapping("/AdminDetails/{aId}")
	public AdminDetails getAdminById(@PathVariable(value="aId")int aId) {
		return loanService.findAdminDetails(aId);
	}
	
	@GetMapping("/AdminDetailsbymail/{email}")
	public List<AdminDetails> getAdminDetailsByEmail(@PathVariable(value="email")String email){
		return loanService.findAdminDetailsByEmail(email);
	}
	
	@PutMapping("/AdminDetails")
	public boolean updateAdminDetails(@RequestBody AdminDetails admindetails)
	{
		return loanService.updateAdminDetails(admindetails);
	}
	
	
	
	@PostMapping("/AdminDetails")
	public boolean addAdminDetails(@RequestBody AdminDetails admindetails)
	{
		return loanService.addAdminDetails(admindetails);
	}
	

	
	
}
