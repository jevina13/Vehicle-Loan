package com.lti.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLEDETAILS")
public class VehicleDetails {
	
	@Id
	@Column(name="VEH_ID")
	private int vehid;
	
	@Column(name="U_ID")
	private int uid;
	
	@Column(name="CARMAKE")
	private String carmake;
	
	@Column(name="VEHICLE_TYPE")
	private String vehicletype;
	
	@Column(name="VEHICLE_PRICE")
	private int vehicleprice;
	
	@Column(name="EX_SHOWROOMPRICE")
	private int exshowroomprice;
	public int getVehid() {
		return vehid;
	}
	public void setVehid(int vehid) {
		this.vehid = vehid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCarmake() {
		return carmake;
	}
	public void setCarmake(String carmake) {
		this.carmake = carmake;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public int getVehicleprice() {
		return vehicleprice;
	}
	public void setVehicleprice(int vehicleprice) {
		this.vehicleprice = vehicleprice;
	}
	public int getExshowroomprice() {
		return exshowroomprice;
	}
	public void setExshowroomprice(int exshowroomprice) {
		this.exshowroomprice = exshowroomprice;
	}
	
	

}
