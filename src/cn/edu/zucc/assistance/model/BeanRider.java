package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanRider {
	
	public int rider_id;
	public String rider_name;
	public String rider_status = "新人";//新人，正式员工，单王
	public Date rider_time;
	public String rider_phone;
	public String rider_pwd;
	public String rider_city;
	public String getRider_city() {
		return rider_city;
	}
	public void setRider_city(String rider_city) {
		this.rider_city = rider_city;
	}
	public static BeanRider currentLoginUser=null;
	public String getRider_phone() {
		return rider_phone;
	}
	public static BeanRider getCurrentLoginUser() {
		return currentLoginUser;
	}
	public static void setCurrentLoginUser(BeanRider currentLoginUser) {
		BeanRider.currentLoginUser = currentLoginUser;
	}
	public void setRider_phone(String rider_phone) {
		this.rider_phone = rider_phone;
	}
	public String getRider_pwd() {
		return rider_pwd;
	}
	public void setRider_pwd(String rider_pwd) {
		this.rider_pwd = rider_pwd;
	}
	public int getRider_id() {
		return rider_id;
	}
	public void setRider_id(int rider_id) {
		this.rider_id = rider_id;
	}
	public String getRider_name() {
		return rider_name;
	}
	public void setRider_name(String rider_name) {
		this.rider_name = rider_name;
	}
	public String getRider_status() {
		return rider_status;
	}
	public void setRider_status(String rider_status) {
		this.rider_status = rider_status;
	}
	public Date getRider_time() {
		return rider_time;
	}
	public void setRider_time(Date rider_time) {
		this.rider_time = rider_time;
	}
	
}
