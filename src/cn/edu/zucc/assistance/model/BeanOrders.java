package cn.edu.zucc.assistance.model;

public class BeanOrders {
	public int order_id;
	public int order_sum;//订单商品数量
	public double order_price;
	public double order_discount;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getOrder_sum() {
		return order_sum;
	}
	public void setOrder_sum(int order_sum) {
		this.order_sum = order_sum;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public double getOrder_discount() {
		return order_discount;
	}
	public void setOrder_discount(double order_discount) {
		this.order_discount = order_discount;
	}
	
}	
