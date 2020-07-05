package cn.edu.zucc.assistance.control;

import java.sql.Connection;
import java.sql.SQLException;

import cn.edu.zucc.assistance.itf.IRiderManager;
import cn.edu.zucc.assistance.model.BeanRider;
import cn.edu.zucc.assistance.util.BaseException;
import cn.edu.zucc.assistance.util.BusinessException;
import cn.edu.zucc.assistance.util.DBUtil;
import cn.edu.zucc.assistance.util.DbException;

public class RiderManager implements IRiderManager{

	public BeanRider login(String userphone,String pwd)throws BaseException {
		BeanRider br = new BeanRider();
		
		return br;
	}
	
	public BeanRider reg(String ridername,String riderphone,String ridercity,String pwd1,String pwd2){
		BeanRider br = new BeanRider();
		
		return br;
	}
}
