package cn.edu.zucc.assistance.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cn.edu.zucc.assistance.assistanceUtil;
import cn.edu.zucc.assistance.model.BeanMyuser;
import cn.edu.zucc.assistance.model.BeanRider;
import cn.edu.zucc.assistance.model.BeanShop;
import cn.edu.zucc.assistance.model.BeanStaff;
import cn.edu.zucc.assistance.ui.FrmRiderRegister;
import cn.edu.zucc.assistance.ui.FrmShopRegister;
import cn.edu.zucc.assistance.ui.FrmStaffRegister;
import cn.edu.zucc.assistance.ui.FrmUserRegister;
import cn.edu.zucc.assistance.util.BaseException;





public class FrmLoginChoose extends JDialog implements ActionListener{//ѡ�����֡��û�������Ա���̼ҽ���
	private JPanel jp_login = new JPanel();
	private JPanel jp_register = new JPanel();
	private JButton btnUserLogin = new JButton("�û���½");
	private JButton btnRiderLogin = new JButton("���ֵ�½");
	private JButton btnShopLogin = new JButton("�̼ҵ�½");
	private JButton btnStaffLogin = new JButton("����Ա��½");
	private JButton btnCancel = new JButton("�˳�");
	private JButton btnUserRegister = new JButton("�û�ע��");
	private JButton btnRiderRegister = new JButton("����ע��");
	private JButton btnShopRegister = new JButton("�̼�ע��");
	private JButton btnStaffRegister = new JButton("����Աע��");
	
	private JLabel labelUserPhone = new JLabel("�û��绰��");
	private JLabel labelPwd = new JLabel("���룺");
	private JTextField edtUserPhone = new JTextField(20);
	private JPasswordField edtPwd = new JPasswordField(20);
	
	public FrmLoginChoose(Frame f, String s, boolean b) {
		super(f, s, b);
		jp_login.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_register.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_register.add(this.btnUserRegister);
		jp_register.add(this.btnRiderRegister);
		jp_register.add(this.btnShopRegister);
		jp_register.add(this.btnStaffRegister);
		jp_login.add(this.btnUserLogin);
		jp_login.add(this.btnRiderLogin);
		jp_login.add(this.btnShopLogin);
		jp_login.add(this.btnStaffLogin);
		jp_login.add(this.btnCancel);
		this.getContentPane().add(jp_login, BorderLayout.NORTH);
		this.getContentPane().add(jp_register, BorderLayout.SOUTH);
		this.setSize(320, 140);
		// ��Ļ������ʾ
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();
		
		this.btnUserRegister.addActionListener(this);
		this.btnRiderRegister.addActionListener(this);
		this.btnShopRegister.addActionListener(this);
		this.btnStaffRegister.addActionListener(this);
		this.btnUserLogin.addActionListener(this);
		this.btnRiderLogin.addActionListener(this);
		this.btnShopLogin.addActionListener(this);
		this.btnStaffLogin.addActionListener(this);
		this.btnCancel.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.btnUserLogin) {
			String userPhone=this.edtUserPhone.getText();
			String pwd=new String(this.edtPwd.getPassword());
			try {
				BeanMyuser.currentLoginUser= assistanceUtil.myUserManager.login(userPhone, pwd);
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "����",JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setVisible(false);
			
		} 
		else if (e.getSource() == this.btnRiderLogin) {
			String userPhone=this.edtUserPhone.getText();
			String pwd=new String(this.edtPwd.getPassword());
			try {
				BeanRider.currentLoginUser= assistanceUtil.riderManager.login(userPhone, pwd);
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "����",JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setVisible(false);	
		}
		else if (e.getSource() == this.btnShopLogin) {
			String usePhone=this.edtUserPhone.getText();
			String pwd=new String(this.edtPwd.getPassword());
			try {
				BeanShop.currentLoginUser= assistanceUtil.shopManager.login(usePhone, pwd);
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "����",JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setVisible(false);
			
		}
		else if (e.getSource() == this.btnStaffLogin) {
			String userPhone=this.edtUserPhone.getText();
			String pwd=new String(this.edtPwd.getPassword());
			try {
				BeanStaff.currentLoginUser= assistanceUtil.staffManager.login(userPhone, pwd);
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "����",JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setVisible(false);
			
		}
		else if (e.getSource() == this.btnUserRegister) {
			FrmUserRegister dlg=new FrmUserRegister(this,"ע��",true);
			dlg.setVisible(true);
		}
		else if (e.getSource() == this.btnRiderRegister) {
			FrmRiderRegister dlg=new FrmRiderRegister(this,"ע��",true);
			dlg.setVisible(true);
		}
		else if (e.getSource() == this.btnShopRegister) {
			FrmShopRegister dlg=new FrmShopRegister(this,"ע��",true);
			dlg.setVisible(true);
		}
		else if (e.getSource() == this.btnStaffRegister) {
			FrmStaffRegister dlg=new FrmStaffRegister(this,"ע��",true);
			dlg.setVisible(true);
		}
		else if (e.getSource() == this.btnCancel) {
			System.exit(0);
		}
	}

}
