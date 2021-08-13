package com.lti.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ELIGIBILITY")
public class Eligibility {
	
	@Id
	@Column(name="DOC_ID")
	private int docid;

	@Column(name="U_ID")
	private int uid;
	
	@Column(name="EMPLOYEMENT_TYPE")
	private String employementtype;
	
	@Column(name="ANNUAL_SALARY")
	private int annualsalary;
	
	@Column(name="EXISTING_EMI")
	private String existingemi;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmployementtype() {
		return employementtype;
	}
	public void setEmployementtype(String employementtype) {
		this.employementtype = employementtype;
	}
	public int getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(int annualsalary) {
		this.annualsalary = annualsalary;
	}
	public String getExistingemi() {
		return existingemi;
	}
	public void setExistingemi(String existingemi) {
		this.existingemi = existingemi;
	}
	
	

}
