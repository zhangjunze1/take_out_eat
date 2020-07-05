package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanCoupon {

	public int coupon_id;
	public int shop_id;
	public double coupon_youhui;
	public int coupon_list_num;
	public Date coupon_time_start;
	public Date coupon_time_finish;
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
	public double getCoupon_youhui() {
		return coupon_youhui;
	}
	public void setCoupon_youhui(double coupon_youhui) {
		this.coupon_youhui = coupon_youhui;
	}
	public int getCoupon_list_num() {
		return coupon_list_num;
	}
	public void setCoupon_list_num(int coupon_list_num) {
		this.coupon_list_num = coupon_list_num;
	}
	public Date getCoupon_time_start() {
		return coupon_time_start;
	}
	public void setCoupon_time_start(Date coupon_time_start) {
		this.coupon_time_start = coupon_time_start;
	}
	public Date getCoupon_time_finish() {
		return coupon_time_finish;
	}
	public void setCoupon_time_finish(Date coupon_time_finish) {
		this.coupon_time_finish = coupon_time_finish;
	}
	
}
