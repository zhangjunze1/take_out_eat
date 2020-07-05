package cn.edu.zucc.assistance.itf;

import java.beans.Beans;
import java.sql.Connection;

import cn.edu.zucc.assistance.model.BeanShop;
import cn.edu.zucc.assistance.util.BaseException;
public interface IShopManager {
	
	
	public BeanShop login(String userphone , String pwd)throws BaseException;
	
	public BeanShop reg(String shopname,String shopphone,String pwd1,String pwd2);
	
}
