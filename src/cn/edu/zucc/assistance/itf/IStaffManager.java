package cn.edu.zucc.assistance.itf;

import java.sql.Connection;

import cn.edu.zucc.assistance.model.BeanStaff;
import cn.edu.zucc.assistance.util.BaseException;

public interface IStaffManager {
		
	public BeanStaff login(String userphone,String pwd)throws BaseException ;
	
	public BeanStaff reg(String staffrname,String staffphone,String pwd1,String pwd2);

}
