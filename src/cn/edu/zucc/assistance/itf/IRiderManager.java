package cn.edu.zucc.assistance.itf;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Connection;


import cn.edu.zucc.assistance.model.BeanRider;
import cn.edu.zucc.assistance.util.BaseException;


public interface IRiderManager {
	
	public BeanRider login(String userphone,String pwd)throws BaseException ;
	
	public BeanRider reg(String ridername,String riderphone,String ridercity,String pwd1,String pwd2);
	
}
