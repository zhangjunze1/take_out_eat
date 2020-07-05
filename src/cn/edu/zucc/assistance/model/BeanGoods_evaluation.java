package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanGoods_evaluation {
	public int shop_id;
	public int goods_id;
	public int user_id;
	public String  goods_evaluation_to;
	public Date goods_evaluation_time;
	public String goods_evaluation_photo;
	public int goods_evaluation_star;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getGoods_evaluation_to() {
		return goods_evaluation_to;
	}
	public void setGoods_evaluation_to(String goods_evaluation_to) {
		this.goods_evaluation_to = goods_evaluation_to;
	}
	public Date getGoods_evaluation_time() {
		return goods_evaluation_time;
	}
	public void setGoods_evaluation_time(Date goods_evaluation_time) {
		this.goods_evaluation_time = goods_evaluation_time;
	}
	public String getGoods_evaluation_photo() {
		return goods_evaluation_photo;
	}
	public void setGoods_evaluation_photo(String goods_evaluation_photo) {
		this.goods_evaluation_photo = goods_evaluation_photo;
	}
	public int getGoods_evaluation_star() {
		return goods_evaluation_star;
	}
	public void setGoods_evaluation_star(int goods_evaluation_star) {
		this.goods_evaluation_star = goods_evaluation_star;
	}
}
