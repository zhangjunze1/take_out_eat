package cn.edu.zucc.assistance;

import cn.edu.zucc.assistance.control.ExamplePlanManager;
import cn.edu.zucc.assistance.control.ExampleStepManager;
import cn.edu.zucc.assistance.control.ExampleUserManager;
import cn.edu.zucc.assistance.itf.IPlanManager;
import cn.edu.zucc.assistance.itf.IStepManager;
import cn.edu.zucc.assistance.itf.IUserManager;

public class assistanceUtil {
	public static IPlanManager planManager=new ExamplePlanManager();//��Ҫ����������Ƶ�ʵ����
	public static IStepManager stepManager=new ExampleStepManager();//��Ҫ����������Ƶ�ʵ����
	public static IUserManager userManager=new ExampleUserManager();//��Ҫ����������Ƶ�ʵ����

}
