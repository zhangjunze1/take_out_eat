package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanShop_order {
	
	public int coupon_id;
	public int shop_id;
	public int mj_id;
	public int user_id;
	public int add_id;
	public int order_id;
	public int rider_id;
	public double so_old_money;
	public double so_new_money;
	public Date so_order_time;
	public Date so_intime;
	public String so_state;
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public int getMj_id() {
		return mj_id;
	}
	public void setMj_id(int mj_id) {
		this.mj_id = mj_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getRider_id() {
		return rider_id;
	}
	public void setRider_id(int rider_id) {
		this.rider_id = rider_id;
	}
	public double getSo_old_money() {
		return so_old_money;
	}
	public void setSo_old_money(double so_old_money) {
		this.so_old_money = so_old_money;
	}
	public double getSo_new_money() {
		return so_new_money;
	}
	public void setSo_new_money(double so_new_money) {
		this.so_new_money = so_new_money;
	}
	public Date getSo_order_time() {
		return so_order_time;
	}
	public void setSo_order_time(Date so_order_time) {
		this.so_order_time = so_order_time;
	}
	public Date getSo_intime() {
		return so_intime;
	}
	public void setSo_intime(Date so_intime) {
		this.so_intime = so_intime;
	}
	public String getSo_state() {
		return so_state;
	}
	public void setSo_state(String so_state) {
		this.so_state = so_state;
	}
	
}
