package cn.edu.zucc.assistance;

import cn.edu.zucc.assistance.control.*;
import cn.edu.zucc.assistance.itf.*;





public class assistanceUtil {
	public static MyUserManager myUserManager=new MyUserManager();//需要换成自行设计的实现类
	public static RiderManager riderManager =new RiderManager(); //需要换成自行设计的实现类
	public static ShopManager shopManager =new ShopManager(); //需要换成自行设计的实现类
	public static StaffManager staffManager =new StaffManager(); //需要换成自行设计的实现类

}
