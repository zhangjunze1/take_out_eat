package cn.edu.zucc.assistance.control;

import java.sql.Connection;
import java.sql.SQLException;

import cn.edu.zucc.assistance.itf.IShopManager;
import cn.edu.zucc.assistance.model.BeanShop;
import cn.edu.zucc.assistance.util.BaseException;
import cn.edu.zucc.assistance.util.BusinessException;
import cn.edu.zucc.assistance.util.DBUtil;
import cn.edu.zucc.assistance.util.DbException;

public class ShopManager implements IShopManager{

	public BeanShop login(String userphone,String pwd)throws BaseException {
		BeanShop bs = new BeanShop();
		
		return bs;
	}
	
	public BeanShop reg(String shopname,String shopphone,String pwd1,String pwd2) {
		BeanShop bs = new BeanShop();
		
		return bs;
	}
}
