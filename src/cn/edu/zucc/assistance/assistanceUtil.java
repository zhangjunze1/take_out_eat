package cn.edu.zucc.assistance;

import cn.edu.zucc.assistance.control.ExamplePlanManager;
import cn.edu.zucc.assistance.control.ExampleStepManager;
import cn.edu.zucc.assistance.control.ExampleUserManager;
import cn.edu.zucc.assistance.itf.IPlanManager;
import cn.edu.zucc.assistance.itf.IStepManager;
import cn.edu.zucc.assistance.itf.IUserManager;

public class assistanceUtil {
	public static IPlanManager planManager=new ExamplePlanManager();//需要换成自行设计的实现类
	public static IStepManager stepManager=new ExampleStepManager();//需要换成自行设计的实现类
	public static IUserManager userManager=new ExampleUserManager();//需要换成自行设计的实现类

}
