package com.lti.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOANDETAILS")
public class LoanDetails {
	
	@Id
	@Column(name="L_ID")
	private int lid;
	
	@Column(name="U_ID")
	private int uid;
	
	@Column(name="LOAN_AMOUNT")
	private int loanamount;
	
	@Column(name="LOAN_TENURE_YEARS")
	private int loantenureyears;
	
	@Column(name="RATEOFINTEREST_BIKE")
	private String rateofinterestbike;
	
	@Column(name="RATEOFINTEREST_CAR")
	private String rateofinterestcar;
	
	@Column(name="BEST_RATE")
	private int bestrate;
	
	@Column(name="PROCESSING_FEE")
	private int processingfee;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}

	public int getLoantenureyears() {
		return loantenureyears;
	}

	public void setLoantenureyears(int loantenureyears) {
		this.loantenureyears = loantenureyears;
	}

	public String getRateofinterestbike() {
		return rateofinterestbike;
	}

	public void setRateofinterestbike(String rateofinterestbike) {
		this.rateofinterestbike = rateofinterestbike;
	}

	public String getRateofinterestcar() {
		return rateofinterestcar;
	}

	public void setRateofinterestcar(String rateofinterestcar) {
		this.rateofinterestcar = rateofinterestcar;
	}

	public int getBestrate() {
		return bestrate;
	}

	public void setBestrate(int bestrate) {
		this.bestrate = bestrate;
	}

	public int getProcessingfee() {
		return processingfee;
	}

	public void setProcessingfee(int processingfee) {
		this.processingfee = processingfee;
	}
	
	

}
