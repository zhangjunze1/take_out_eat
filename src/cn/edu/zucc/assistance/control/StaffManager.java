package cn.edu.zucc.assistance.control;

import java.sql.Connection;
import java.sql.SQLException;

import cn.edu.zucc.assistance.itf.IStaffManager;
import cn.edu.zucc.assistance.model.BeanStaff;
import cn.edu.zucc.assistance.util.BaseException;
import cn.edu.zucc.assistance.util.BusinessException;
import cn.edu.zucc.assistance.util.DBUtil;
import cn.edu.zucc.assistance.util.DbException;

public class StaffManager implements  IStaffManager{
	
	public BeanStaff login(String userphone,String pwd)throws BaseException {
		BeanStaff bst = new BeanStaff();
		
		return bst;
	}
	
	public BeanStaff reg(String staffrname,String staffphone,String pwd1,String pwd2) {
		BeanStaff bst = new BeanStaff();
		
		return bst;
	}
}
