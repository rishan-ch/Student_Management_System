package com.view;

import java.awt.EventQueue;
import com.service.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.model.Student;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;

public class StudentViewForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JLabel lblRollno;
	private JLabel lblNewLabel_1_1;
	private JTextField rollnotxt;
	private JTextField emailtxt;
	private JLabel lblDob;
	private JLabel lblNewLabel_1_2;
	private JTextField dobtxt;
	private JTextField collegetxt;
	private JLabel lblAge;
	private JLabel lblNewLabel_1_3;
	private JTextField agetxt;
	private JTextField phonetxt;
	private JLabel lblCountry;
	private JLabel lblNewLabel_1_4;
	private JTextField countrytxt;
	private JTextField citytxt;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JRadioButton malebtn;
	private JRadioButton femalebtn;
	private JLabel lblFaculty;
	private JTextField facultytxt;
	private JComboBox statetxt;
	private int sid =0;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentViewForm frame = new StudentViewForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentViewForm() {
		setTitle("Student View Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFnametxt());
		contentPane.add(getLnametxt());
		contentPane.add(getLblRollno());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getRollnotxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getLblDob());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getDobtxt());
		contentPane.add(getCollegetxt());
		contentPane.add(getLblAge());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getAgetxt());
		contentPane.add(getPhonetxt());
		contentPane.add(getLblCountry());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getCountrytxt());
		contentPane.add(getCitytxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getMalebtn());
		contentPane.add(getFemalebtn());
		contentPane.add(getLblFaculty());
		contentPane.add(getFacultytxt());
		contentPane.add(getStatetxt());
		contentPane.add(getBtnNewButton());
		
		
		
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("FirstName");
			lblNewLabel.setBounds(30, 26, 70, 14);
		}
		return lblNewLabel;
	}
	

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("LastName");
			lblNewLabel_1.setBounds(30, 72, 70, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setEnabled(false);
			fnametxt.setBounds(110, 17, 137, 33);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setEnabled(false);
			lnametxt.setColumns(10);
			lnametxt.setBounds(110, 63, 137, 33);
		}
		return lnametxt;
	}
	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("Rollno");
			lblRollno.setBounds(285, 26, 55, 14);
		}
		return lblRollno;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Email");
			lblNewLabel_1_1.setBounds(285, 72, 55, 14);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getRollnotxt() {
		if (rollnotxt == null) {
			rollnotxt = new JTextField();
			rollnotxt.setEnabled(false);
			rollnotxt.setColumns(10);
			rollnotxt.setBounds(345, 17, 137, 33);
		}
		return rollnotxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setEnabled(false);
			emailtxt.setColumns(10);
			emailtxt.setBounds(345, 63, 137, 33);
		}
		return emailtxt;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DOB");
			lblDob.setBounds(30, 129, 55, 14);
		}
		return lblDob;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("College");
			lblNewLabel_1_2.setBounds(30, 175, 55, 14);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getDobtxt() {
		if (dobtxt == null) {
			dobtxt = new JTextField();
			dobtxt.setEnabled(false);
			dobtxt.setColumns(10);
			dobtxt.setBounds(110, 120, 137, 33);
		}
		return dobtxt;
	}
	private JTextField getCollegetxt() {
		if (collegetxt == null) {
			collegetxt = new JTextField();
			collegetxt.setEnabled(false);
			collegetxt.setColumns(10);
			collegetxt.setBounds(110, 166, 137, 33);
		}
		return collegetxt;
	}
	private JLabel getLblAge() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setBounds(285, 129, 55, 14);
		}
		return lblAge;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Phone");
			lblNewLabel_1_3.setBounds(285, 175, 55, 14);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getAgetxt() {
		if (agetxt == null) {
			agetxt = new JTextField();
			agetxt.setEnabled(false);
			agetxt.setColumns(10);
			agetxt.setBounds(345, 120, 137, 33);
		}
		return agetxt;
	}
	private JTextField getPhonetxt() {
		if (phonetxt == null) {
			phonetxt = new JTextField();
			phonetxt.setEnabled(false);
			phonetxt.setColumns(10);
			phonetxt.setBounds(345, 166, 137, 33);
		}
		return phonetxt;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(30, 233, 55, 14);
		}
		return lblCountry;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("City");
			lblNewLabel_1_4.setBounds(30, 279, 55, 14);
		}
		return lblNewLabel_1_4;
	}
	private JTextField getCountrytxt() {
		if (countrytxt == null) {
			countrytxt = new JTextField();
			countrytxt.setEnabled(false);
			countrytxt.setColumns(10);
			countrytxt.setBounds(110, 224, 137, 33);
		}
		return countrytxt;
	}
	private JTextField getCitytxt() {
		if (citytxt == null) {
			citytxt = new JTextField();
			citytxt.setEnabled(false);
			citytxt.setColumns(10);
			citytxt.setBounds(110, 270, 137, 33);
		}
		return citytxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("State");
			lblNewLabel_2.setBounds(30, 326, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Gender");
			lblNewLabel_3.setBounds(285, 233, 46, 14);
		}
		return lblNewLabel_3;
	}
	private JRadioButton getMalebtn() {
		if (malebtn == null) {
			malebtn = new JRadioButton("Male");
			malebtn.setEnabled(false);
			malebtn.setBounds(345, 229, 55, 23);
		}
		return malebtn;
	}
	private JRadioButton getFemalebtn() {
		if (femalebtn == null) {
			femalebtn = new JRadioButton("Female");
			femalebtn.setEnabled(false);
			femalebtn.setBounds(402, 229, 75, 23);
		}
		return femalebtn;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(285, 279, 55, 14);
		}
		return lblFaculty;
	}
	private JTextField getFacultytxt() {
		if (facultytxt == null) {
			facultytxt = new JTextField();
			facultytxt.setEnabled(false);
			facultytxt.setColumns(10);
			facultytxt.setBounds(347, 270, 137, 33);
		}
		return facultytxt;
	}
	private JComboBox getStatetxt() {
		String arr[]= {"-Select-","State 1","State 2","State 3","State 4","State 5","State 6","State 7"};
		if (statetxt == null) {
			statetxt = new JComboBox<String>(arr);
			statetxt.setBounds(110, 323, 137, 22);
		}
		return statetxt;
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new StudentForm().setVisible(true);
					dispose();
					
				}
			});
			btnNewButton.setBounds(191, 373, 142, 42);
		}
		return btnNewButton;
	}
	
	public void setDataInView(int id) {
		
		StudentService ss = new StudentServiceImpl();
		Student s = ss.getStudentById(id);
		

		fnametxt.setText(s.getFname());
		lnametxt.setText(s.getLname());
		dobtxt.setText(s.getDob());
		collegetxt.setText(s.getCollege());
		countrytxt.setText(s.getCountry());
		citytxt.setText(s.getCity());
		rollnotxt.setText(String.valueOf(s.getRollno()));
		agetxt.setText(String.valueOf(s.getAge()));
		emailtxt.setText(s.getEmail());
		phonetxt.setText(s.getPhone());
		facultytxt.setText(s.getFaculty());
		statetxt.setSelectedItem(s.getState());
		
//		if(s.getGender().equals("Male")) {
//			malebtn.setSelected(true)
//		}
		if(s.getGender().equals("Male")) {
			malebtn.setSelected(true);
		}
		else {
			femalebtn.setSelected(true);
		}
		
	}
	
}
