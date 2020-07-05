package cn.edu.zucc.assistance.model;

public class BeanOrders_coupons {
	
	public int shop_id;
	public int user_id;
	public int coupon_id;
	public int orders_coupons_need;
	public int orders_coupons_already;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public int getOrders_coupons_need() {
		return orders_coupons_need;
	}
	public void setOrders_coupons_need(int orders_coupons_need) {
		this.orders_coupons_need = orders_coupons_need;
	}
	public int getOrders_coupons_already() {
		return orders_coupons_already;
	}
	public void setOrders_coupons_already(int orders_coupons_already) {
		this.orders_coupons_already = orders_coupons_already;
	}
	
}
