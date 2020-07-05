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
import cn.edu.zucc.assistance.model.BeanStaff;
import cn.edu.zucc.assistance.util.BaseException;

public class FrmStaffRegister extends JDialog implements ActionListener{
	
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private Button btnOk = new Button("×¢²á");
	private Button btnCancel = new Button("È¡Ïû");
	
	private JLabel labelStaffname =  new JLabel("ÐÕÃû£º");
	private JLabel labelStaffphone =  new JLabel("µç»°ºÅÂë£º");
	private JLabel labelPwd = new JLabel("ÃÜÂë£º");
	private JLabel labelPwd2 = new JLabel("ÃÜÂë£º");
	
	private JTextField edtStaffname = new JTextField(20);
	private JTextField edtStaffphone = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);
	private JPasswordField edtPwd2 = new JPasswordField(20);
	
	public FrmStaffRegister(Dialog f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public FrmStaffRegister(Frame f, String s, boolean b) {
		super(f, s, b);
		fsb();
	}
	
	public void fsb() {
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(this.btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		workPane.add(labelStaffname);
		workPane.add(edtStaffname);
		workPane.add(labelStaffphone);
		workPane.add(edtStaffphone);
		workPane.add(labelPwd);
		workPane.add(edtPwd);
		workPane.add(labelPwd2);
		workPane.add(edtPwd2);
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		this.setSize(300, 240);
		this.btnCancel.addActionListener(this);
		this.btnOk.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnCancel)
			this.setVisible(false);
		else if(e.getSource()==this.btnOk){
			String staffname=this.edtStaffname.getText();
			String staffphone=this.edtStaffphone.getText();
			String pwd1=new String(this.edtPwd.getPassword());
			String pwd2=new String(this.edtPwd2.getPassword());
			BeanStaff staff=assistanceUtil.staffManager.reg(staffname,staffphone,pwd1,pwd2);
			this.setVisible(false);
			
		}
	}
	
	
}
