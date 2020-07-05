package cn.edu.zucc.assistance.model;

public class BeanShop {
	
	public int shop_id;
	public String shop_name;
	public int star;
	public double shop_perConsume;
	public double shop_total;
	public int shop_count;
	public String shop_phone;
	public String shop_pwd;
	public static BeanShop currentLoginUser=null;
	
	public static BeanShop getCurrentLoginUser() {
		return currentLoginUser;
	}
	public static void setCurrentLoginUser(BeanShop currentLoginUser) {
		BeanShop.currentLoginUser = currentLoginUser;
	}
	public String getShop_phone() {
		return shop_phone;
	}
	public void setShop_phone(String shop_phone) {
		this.shop_phone = shop_phone;
	}
	public String getShop_pwd() {
		return shop_pwd;
	}
	public void setShop_pwd(String shop_pwd) {
		this.shop_pwd = shop_pwd;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public double getShop_perConsume() {
		return shop_perConsume;
	}
	public void setShop_perConsume(double shop_perConsume) {
		this.shop_perConsume = shop_perConsume;
	}
	public double getShop_total() {
		return shop_total;
	}
	public void setShop_total(double shop_total) {
		this.shop_total = shop_total;
	}
	public int getShop_count() {
		return shop_count;
	}
	public void setShop_count(int shop_count) {
		this.shop_count = shop_count;
	}
	
}
