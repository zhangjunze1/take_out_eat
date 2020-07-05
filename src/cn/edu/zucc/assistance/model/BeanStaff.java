package cn.edu.zucc.assistance.model;

public class BeanStaff {
	
	public int staff_id;
	public String staff_name;
	public String staff_pwd;
	public static BeanStaff currentLoginUser=null;
	public static BeanStaff getCurrentLoginUser() {
		return currentLoginUser;
	}
	public static void setCurrentLoginUser(BeanStaff currentLoginUser) {
		BeanStaff.currentLoginUser = currentLoginUser;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getStaff_pwd() {
		return staff_pwd;
	}
	public void setStaff_pwd(String staff_pwd) {
		this.staff_pwd = staff_pwd;
	}
	
}
