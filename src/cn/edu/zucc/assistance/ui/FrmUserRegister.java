package cn.edu.zucc.assistance.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cn.edu.zucc.assistance.assistanceUtil;
import cn.edu.zucc.assistance.model.BeanMyuser;
import cn.edu.zucc.assistance.util.BaseException;


public class FrmUserRegister extends JDialog implements ActionListener{
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private Button btnOk = new Button("注册");
	private Button btnCancel = new Button("取消");
	
	private JLabel labelUsername =  new JLabel("姓名：");
	private JLabel labelUsersex =  new JLabel("性别：");
	private JLabel labelUserphone =  new JLabel("电话号码：");
	private JLabel labelUseremail =  new JLabel("邮箱：");
	private JLabel labelUsercity =  new JLabel("城市：");
	private JLabel labelPwd = new JLabel("密码：");
	private JLabel labelPwd2 = new JLabel("密码：");
	
	private JTextField edtUsername = new JTextField(20);
	private JTextField edtUsersex = new JTextField(20);
	private JTextField edtUserphone = new JTextField(20);
	private JTextField edtUseremail = new JTextField(20);
	private JTextField edtUsercity = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);
	private JPasswordField edtPwd2 = new JPasswordField(20);
	
	public FrmUserRegister(Dialog f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public FrmUserRegister(Frame f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public void fsb() {
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(this.btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.add(labelUsername);
		workPane.add(edtUsername);
		workPane.add(labelUsersex);
		workPane.add(edtUsersex);
		workPane.add(labelUserphone);
		workPane.add(edtUserphone);
		workPane.add(labelUseremail);
		workPane.add(edtUseremail);
		workPane.add(labelUsercity);
		workPane.add(edtUsercity);
		workPane.add(labelPwd);
		workPane.add(edtPwd);
		workPane.add(labelPwd2);
		workPane.add(edtPwd2);
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(300, 400);
		this.btnCancel.addActionListener(this);
		this.btnOk.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnCancel)
			this.setVisible(false);
		else if(e.getSource()==this.btnOk){
			String username=this.edtUsername.getText();
			String usersex=this.edtUsersex.getText();
			String userphone=this.edtUserphone.getText();
			String useremail=this.edtUseremail.getText();
			String usercity=this.edtUsercity.getText();
			String pwd1=new String(this.edtPwd.getPassword());
			String pwd2=new String(this.edtPwd2.getPassword());
			BeanMyuser user=assistanceUtil.myUserManager.reg(username,usersex,userphone,useremail,usercity,pwd1,pwd2);
			this.setVisible(false);
			
		}
	}
	
}
