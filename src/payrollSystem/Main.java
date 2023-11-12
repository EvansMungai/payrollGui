package payrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldRatePerHour;
	private JTextField textFieldHoursPerDay;
	private JTextField textFieldDaysWorked;
	private JTextField textFieldMonthlyWageTax;
	private JTextField textFieldPhilhealth;
	private JTextField textFieldSSS;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldDeductions;
	private JTextField textFieldShowSalary;
	private JTextField textFieldTotalDeduction;
	private JTextField textFieldNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(238, 11, 226, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setBounds(28, 56, 106, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour:");
		lblNewLabel_2.setBounds(54, 81, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hours Per Day:");
		lblNewLabel_3.setBounds(54, 116, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of days worked:");
		lblNewLabel_4.setBounds(10, 141, 124, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(144, 53, 86, 20);
		frame.getContentPane().add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		textFieldRatePerHour = new JTextField();
		textFieldRatePerHour.setBounds(144, 78, 86, 20);
		frame.getContentPane().add(textFieldRatePerHour);
		textFieldRatePerHour.setColumns(10);
		
		textFieldHoursPerDay = new JTextField();
		textFieldHoursPerDay.setBounds(144, 109, 86, 20);
		frame.getContentPane().add(textFieldHoursPerDay);
		textFieldHoursPerDay.setColumns(10);
		
		textFieldDaysWorked = new JTextField();
		textFieldDaysWorked.setBounds(144, 138, 86, 20);
		frame.getContentPane().add(textFieldDaysWorked);
		textFieldDaysWorked.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DEDUCTION FOR SALARY");
		lblNewLabel_5.setForeground(new Color(204, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(248, 55, 185, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tax 15% of Monthly Wage");
		lblNewLabel_6.setBounds(238, 81, 146, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Philhealth 5%");
		lblNewLabel_7.setBounds(295, 112, 89, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SSS 2%");
		lblNewLabel_8.setBounds(322, 141, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textFieldMonthlyWageTax = new JTextField();
		textFieldMonthlyWageTax.setEnabled(false);
		textFieldMonthlyWageTax.setEditable(false);
		textFieldMonthlyWageTax.setBounds(394, 81, 86, 20);
		frame.getContentPane().add(textFieldMonthlyWageTax);
		textFieldMonthlyWageTax.setColumns(10);
		
		textFieldPhilhealth = new JTextField();
		textFieldPhilhealth.setEnabled(false);
		textFieldPhilhealth.setEditable(false);
		textFieldPhilhealth.setBounds(394, 112, 86, 20);
		frame.getContentPane().add(textFieldPhilhealth);
		textFieldPhilhealth.setColumns(10);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEnabled(false);
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(396, 141, 86, 20);
		frame.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Gross Salary");
		lblNewLabel_9.setBounds(510, 53, 74, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Deductions");
		lblNewLabel_10.setBounds(510, 78, 74, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEnabled(false);
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setBounds(594, 50, 86, 20);
		frame.getContentPane().add(textFieldGrossSalary);
		textFieldGrossSalary.setColumns(10);
		
		textFieldDeductions = new JTextField();
		textFieldDeductions.setEnabled(false);
		textFieldDeductions.setEditable(false);
		textFieldDeductions.setBounds(594, 75, 86, 20);
		frame.getContentPane().add(textFieldDeductions);
		textFieldDeductions.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("GROSS SALARY :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(28, 172, 106, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textFieldShowSalary = new JTextField();
		textFieldShowSalary.setEditable(false);
		textFieldShowSalary.setEnabled(false);
		textFieldShowSalary.setBounds(144, 169, 86, 20);
		frame.getContentPane().add(textFieldShowSalary);
		textFieldShowSalary.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(237, 172, 131, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textFieldTotalDeduction = new JTextField();
		textFieldTotalDeduction.setEnabled(false);
		textFieldTotalDeduction.setEditable(false);
		textFieldTotalDeduction.setBounds(394, 172, 86, 20);
		frame.getContentPane().add(textFieldTotalDeduction);
		textFieldTotalDeduction.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(510, 169, 74, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setEnabled(false);
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setBounds(594, 166, 86, 20);
		frame.getContentPane().add(textFieldNetSalary);
		textFieldNetSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EmployeeName;
				int ratePerHour, hourPerDay, daysWorked, grossSalary;
				double monthlyWageTax, philHealth, SSS, deductions, netSalary;
				EmployeeName = textFieldEmployeeName.getText();
				ratePerHour = Integer.parseInt(textFieldRatePerHour.getText());	
				hourPerDay = Integer.parseInt(textFieldHoursPerDay.getText());
				daysWorked = Integer.parseInt(textFieldDaysWorked.getText());
				grossSalary = ratePerHour * hourPerDay * daysWorked;
				monthlyWageTax = 0.15 * grossSalary;
				philHealth = 0.05 * grossSalary;
				SSS = 0.02 * grossSalary;
				deductions  = monthlyWageTax + philHealth + SSS;
				netSalary = grossSalary - deductions;
				textFieldGrossSalary.setText(String.valueOf(grossSalary));
				textFieldShowSalary.setText(String.valueOf(grossSalary));
				textFieldMonthlyWageTax.setText(String.valueOf((int)monthlyWageTax));
				textFieldPhilhealth.setText(String.valueOf((int)philHealth));
				textFieldSSS.setText(String.valueOf((int)SSS));
				textFieldTotalDeduction.setText(String.valueOf((int)deductions));
				textFieldDeductions.setText(String.valueOf((int)deductions));
				textFieldNetSalary.setText(String.valueOf((int)netSalary));
			}
		});
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(279, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
