package cn.edu.zucc.assistance.model;

import java.util.Date;

import java.util.Date;

public class BeanMyuser {
	public static BeanMyuser currentLoginUser=null;
	public int user_id;
	public String user_name;
	public String user_sex;
	public String user_pwd;
	public String user_phone;
	public String user_email;
	public String user_city;
	public Date user_rigister_time;
	public boolean user_VIP;
	public Date user_VIP_time;
	
	public static BeanMyuser getCurrentLoginUser() {
		return currentLoginUser;
	}
	public static void setCurrentLoginUser(BeanMyuser currentLoginUser) {
		BeanMyuser.currentLoginUser = currentLoginUser;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	public Date getUser_rigister_time() {
		return user_rigister_time;
	}
	public void setUser_rigister_time(Date user_rigister_time) {
		this.user_rigister_time = user_rigister_time;
	}
	public boolean isUser_VIP() {
		return user_VIP;
	}
	public void setUser_VIP(boolean user_VIP) {
		this.user_VIP = user_VIP;
	}
	public Date getUser_VIP_time() {
		return user_VIP_time;
	}
	public void setUser_VIP_time(Date user_VIP_time) {
		this.user_VIP_time = user_VIP_time;
	}
}
