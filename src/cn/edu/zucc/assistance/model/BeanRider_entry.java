package cn.edu.zucc.assistance.model;

import java.util.Date;

public class BeanRider_entry {
	
	public int rider_id;
	public int add_id;
	public Date rider_entry_time;
	public String rider_entry_evaluation;
	public double rider_entry_income;
	public int getRider_id() {
		return rider_id;
	}
	public void setRider_id(int rider_id) {
		this.rider_id = rider_id;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public Date getRider_entry_time() {
		return rider_entry_time;
	}
	public void setRider_entry_time(Date rider_entry_time) {
		this.rider_entry_time = rider_entry_time;
	}
	public String getRider_entry_evaluation() {
		return rider_entry_evaluation;
	}
	public void setRider_entry_evaluation(String rider_entry_evaluation) {
		this.rider_entry_evaluation = rider_entry_evaluation;
	}
	public double getRider_entry_income() {
		return rider_entry_income;
	}
	public void setRider_entry_income(double rider_entry_income) {
		this.rider_entry_income = rider_entry_income;
	}
	
}
