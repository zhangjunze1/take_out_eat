package cn.edu.zucc.assistance.control;

import java.sql.Connection;
import java.sql.SQLException;

import javax.print.attribute.standard.RequestingUserName;

import cn.edu.zucc.assistance.itf.IMyUserManager;
import cn.edu.zucc.assistance.model.BeanMyuser;
import cn.edu.zucc.assistance.util.BaseException;
import cn.edu.zucc.assistance.util.BusinessException;
import cn.edu.zucc.assistance.util.DBUtil;
import cn.edu.zucc.assistance.util.DbException;


public class MyUserManager implements IMyUserManager{

	
	public BeanMyuser login(String userphone, String pwd) throws BaseException {
		BeanMyuser bm= new BeanMyuser();
		
		return bm;
	}
	
	public BeanMyuser reg(String username,String usersex,String userphone,String useremail,String usercity,String pwd1,String pwd2){
		BeanMyuser bm= new BeanMyuser();
		
		return bm;
	}
}
