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
import java.awt.print.PrinterException;

import javax.swing.JInternalFrame;

public class StudentForm extends JFrame {

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
	private JButton addbtn;
	private JButton updatebtn;
	private JLabel lblSearch;
	private JTextField searchtxt;
	private JButton deletebtn;
	private JButton editbtn;
	private JButton viewbtn;
	private JButton printbtn;
	private JButton exitbtn;
	private JSeparator separator;
	private JSeparator separator_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblFaculty;
	private JTextField facultytxt;
	private JComboBox statetxt;
	private int sid =0;
	private JInternalFrame internalFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 504);
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
		contentPane.add(getAddbtn());
		contentPane.add(getUpdatebtn());
		contentPane.add(getLblSearch());
		contentPane.add(getSearchtxt());
		contentPane.add(getDeletebtn());
		contentPane.add(getEditbtn());
		contentPane.add(getViewbtn());
		contentPane.add(getPrintbtn());
		contentPane.add(getExitbtn());
		contentPane.add(getSeparator());
		contentPane.add(getSeparator_1());
		contentPane.add(getScrollPane());
		contentPane.add(getLblFaculty());
		contentPane.add(getFacultytxt());
		contentPane.add(getStatetxt());
		
		
		display();
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
			fnametxt.setBounds(110, 17, 137, 33);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
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
			rollnotxt.setColumns(10);
			rollnotxt.setBounds(345, 17, 137, 33);
		}
		return rollnotxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
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
			dobtxt.setColumns(10);
			dobtxt.setBounds(110, 120, 137, 33);
		}
		return dobtxt;
	}
	private JTextField getCollegetxt() {
		if (collegetxt == null) {
			collegetxt = new JTextField();
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
			agetxt.setColumns(10);
			agetxt.setBounds(345, 120, 137, 33);
		}
		return agetxt;
	}
	private JTextField getPhonetxt() {
		if (phonetxt == null) {
			phonetxt = new JTextField();
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
			countrytxt.setColumns(10);
			countrytxt.setBounds(110, 224, 137, 33);
		}
		return countrytxt;
	}
	private JTextField getCitytxt() {
		if (citytxt == null) {
			citytxt = new JTextField();
			citytxt.setColumns(10);
			citytxt.setBounds(110, 270, 137, 33);
		}
		return citytxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("State");
			lblNewLabel_2.setBounds(30, 327, 46, 14);
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
			malebtn.setBounds(345, 229, 55, 23);
		}
		return malebtn;
	}
	private JRadioButton getFemalebtn() {
		if (femalebtn == null) {
			femalebtn = new JRadioButton("Female");
			femalebtn.setBounds(402, 229, 75, 23);
		}
		return femalebtn;
	}
	private JButton getAddbtn() {
		if (addbtn == null) {
			addbtn = new JButton("Add");
			addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student s = new Student();
					
					s.setFname(fnametxt.getText());
					s.setLname(lnametxt.getText());
					s.setAge(Integer.parseInt( agetxt.getText()));
					s.setCity(citytxt.getText());
					s.setCollege(collegetxt.getText());
					s.setCountry(countrytxt.getText());
					s.setDob(dobtxt.getText());
					s.setEmail(emailtxt.getText());
					s.setFaculty(facultytxt.getText());
					s.setPhone(phonetxt.getText());
					s.setRollno(Integer.parseInt(rollnotxt.getText()));
					s.setState(statetxt.getSelectedItem().toString());
					
					if(malebtn.isSelected()) {
						s.setGender("Male");
					}
					else {
						s.setGender("Female");
					}
					
					
					
					StudentService ss = new StudentServiceImpl();
					
					boolean res = ss.addStudent(s);
					if(res) {
						JOptionPane.showMessageDialog(null, "Added successfully");
					}
					else {
						JOptionPane.showMessageDialog(null, "Failed");
					}
					
					
					
					
					display();
					
				}
			});
			addbtn.setBounds(110, 387, 137, 45);
		}
		return addbtn;
	}
	
	private JButton getUpdatebtn() {
		if (updatebtn == null) {
			updatebtn = new JButton("Update");
			updatebtn.setEnabled(false);
			updatebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Student s = new Student();
					
					s.setId(sid);
					s.setFname(fnametxt.getText());
					s.setLname(lnametxt.getText());
					s.setAge(Integer.parseInt( agetxt.getText()));
					s.setCity(citytxt.getText());
					s.setCollege(collegetxt.getText());
					s.setCountry(countrytxt.getText());
					s.setDob(dobtxt.getText());
					s.setEmail(emailtxt.getText());
					s.setFaculty(facultytxt.getText());
					s.setPhone(phonetxt.getText());
					s.setRollno(Integer.parseInt(rollnotxt.getText()));
					s.setState(statetxt.getSelectedItem().toString());
					
					if(malebtn.isSelected()) {
						s.setGender("Male");
					}
					else {
						s.setGender("Female");
					}
					
					StudentService ss = new StudentServiceImpl();
					
					boolean res = ss.updateStudent(s);
					if(res) {
						JOptionPane.showMessageDialog(null, "Updated successfully");
					}
					else {
						JOptionPane.showMessageDialog(null, "Update Failed");
					}
					
					display();
					addbtn.setEnabled(true);
					updatebtn.setEnabled(false);
					
					
					
				}
			});
			updatebtn.setBounds(345, 387, 137, 45);
		}
		return updatebtn;
	}
	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setBounds(844, 26, 55, 14);
		}
		return lblSearch;
	}
	private JTextField getSearchtxt() {
		if (searchtxt == null) {
			searchtxt = new JTextField();
			
			searchtxt.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyReleased(KeyEvent e) {
					
					String sdata = searchtxt.getText().trim();
					
					StudentService ss = new StudentServiceImpl();
					List<Student> slist = ss.searchStudent(sdata);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					
					tmodel.setRowCount(0);
					
					for(Student s: slist) {
						
						tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getCollege(),s.getAge(),s.getPhone()});
					}
					
					
					
				}
			});
			searchtxt.setColumns(10);
			searchtxt.setBounds(904, 17, 137, 33);
		}
		return searchtxt;
	}
	private JButton getDeletebtn() {
		if (deletebtn == null) {
			deletebtn = new JButton("Delete");
			deletebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select a row first");
						return;
					}
					
					int srow = table.getSelectedRow();
					int sid = (int) table.getModel().getValueAt(srow, 0);
					
					StudentService ss = new StudentServiceImpl();
					
					if(ss.deleteStudent(sid)) {
						JOptionPane.showMessageDialog(null, "Delete Success");
						display();
					}
					else {
						JOptionPane.showMessageDialog(null, "Delete Failed");
					}
					
				}
			});
			deletebtn.setBounds(556, 398, 89, 23);
		}
		return deletebtn;
	}
	private JButton getEditbtn() {
		if (editbtn == null) {
			editbtn = new JButton("Edit");
			editbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select a row first");
						return;
					}
					
					int srow = table.getSelectedRow();
					sid = (int) table.getModel().getValueAt(srow, 0);
					
					StudentService ss = new StudentServiceImpl();
					Student s = ss.getStudentById(sid);
					
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
					
//					if(s.getGender().equals("Male")) {
//						malebtn.setSelected(true)
//					}
					if(s.getGender().equals("Male")) {
						malebtn.setSelected(true);
					}
					else {
						femalebtn.setSelected(true);
					}
					
					addbtn.setEnabled(false);
					updatebtn.setEnabled(true);
					
					
				}
			});
			editbtn.setBounds(659, 398, 89, 23);
		}
		return editbtn;
	}
	private JButton getViewbtn() {
		if (viewbtn == null) {
			viewbtn = new JButton("View");
			viewbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (table.getSelectedRow() < 0) {
	                    JOptionPane.showMessageDialog(null, "Please select a row first");
	                    return;
	                }

	                int srow = table.getSelectedRow();
	                int sid = (int) table.getModel().getValueAt(srow, 0);
	                
	                StudentViewForm view = new StudentViewForm();
	                
	                view.setDataInView(sid);
	                
	                view.setVisible(true);
	                dispose();
	                
	                
					
				}
			});
			viewbtn.setBounds(758, 398, 89, 23);
		}
		return viewbtn;
	}
	private JButton getPrintbtn() {
		if (printbtn == null) {
			printbtn = new JButton("Print");
			printbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			printbtn.setBounds(863, 398, 89, 23);
		}
		return printbtn;
	}
	private JButton getExitbtn() {
		if (exitbtn == null) {
			exitbtn = new JButton("Exit");
			exitbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
					
				}
			});
			exitbtn.setBounds(962, 398, 89, 23);
		}
		return exitbtn;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 356, 1065, 7);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setOrientation(SwingConstants.VERTICAL);
			separator_1.setBounds(515, 11, 7, 334);
		}
		return separator_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(556, 72, 495, 269);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"   ID", "First name", "Last name", "College", "  Age", "  Phone"
				}
			));
		}
		return table;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(267, 279, 55, 14);
		}
		return lblFaculty;
	}
	private JTextField getFacultytxt() {
		if (facultytxt == null) {
			facultytxt = new JTextField();
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
	
	private void display() {
		StudentService ss = new StudentServiceImpl();
		
		List<Student> slist = ss.getAllStudent();
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		
		tmodel.setRowCount(0);
		
		for(Student s: slist) {
			
			tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getCollege(),s.getAge(),s.getPhone()});
		}
		
		
		
	}
}
