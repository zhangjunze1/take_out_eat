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
import cn.edu.zucc.assistance.model.BeanRider;
import cn.edu.zucc.assistance.util.BaseException;

public class FrmRiderRegister extends JDialog implements ActionListener{
	
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private Button btnOk = new Button("注册");
	private Button btnCancel = new Button("取消");
	
	private JLabel labelRidername =  new JLabel("姓名：");
	private JLabel labelRiderphone =  new JLabel("电话号码：");
	private JLabel labelRidercity =  new JLabel("城市：");
	private JLabel labelPwd = new JLabel("密码：");
	private JLabel labelPwd2 = new JLabel("密码：");
	
	private JTextField edtRidername = new JTextField(20);
	private JTextField edtRiderphone = new JTextField(20);
	private JTextField edtRidercity = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);
	private JPasswordField edtPwd2 = new JPasswordField(20);
	
	public FrmRiderRegister(Dialog f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public FrmRiderRegister(Frame f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public void fsb() {
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(this.btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.add(labelRidername);
		workPane.add(edtRidername);
		workPane.add(labelRiderphone);
		workPane.add(edtRiderphone);
		workPane.add(labelRidercity);
		workPane.add(edtRidercity);
		workPane.add(labelPwd);
		workPane.add(edtPwd);
		workPane.add(labelPwd2);
		workPane.add(edtPwd2);
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(300, 300);
		this.btnCancel.addActionListener(this);
		this.btnOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnCancel)
			this.setVisible(false);
		else if(e.getSource()==this.btnOk){
			String ridername=this.edtRidername.getText();
			String riderphone=this.edtRiderphone.getText();
			String ridercity=this.edtRidercity.getText();
			String pwd1=new String(this.edtPwd.getPassword());
			String pwd2=new String(this.edtPwd2.getPassword());
			BeanRider rider=assistanceUtil.riderManager.reg(ridername,riderphone,ridercity,pwd1,pwd2);
			this.setVisible(false);
			
		}
	}
	
}
