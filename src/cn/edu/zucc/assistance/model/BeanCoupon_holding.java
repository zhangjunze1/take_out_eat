package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanCoupon_holding {
	
		public int shop_id;
		public int user_id;
		public int coupon_id;
		public int quantity;
		public Date	closingDate;
		public double youhui;
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
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Date getClosingDate() {
			return closingDate;
		}
		public void setClosingDate(Date closingDate) {
			this.closingDate = closingDate;
		}
		public double getYouhui() {
			return youhui;
		}
		public void setYouhui(double youhui) {
			this.youhui = youhui;
		}
		
}
