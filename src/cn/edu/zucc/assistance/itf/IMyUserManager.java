
package cn.edu.zucc.assistance.itf;

import java.sql.Connection;

import cn.edu.zucc.assistance.model.BeanMyuser;
import cn.edu.zucc.assistance.util.BaseException;

public interface IMyUserManager {

	
	public BeanMyuser login(String userphone,String pwd)throws BaseException ;

	public BeanMyuser reg(String username,String usersex,String userphone,String useremail,String usercity,String pwd1,String pwd2);
	
}