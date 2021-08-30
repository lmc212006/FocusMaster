import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class calendarWhy extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 5590331117304117167L;
	private final JLabel lblNewLabel = new JLabel("Mon");
	private ArrayList<JTextArea> comps = new ArrayList<JTextArea>();
	private ArrayList<String> compString = new ArrayList<String>(); 
	private String userDir = System.getProperty("user.dir");
	private HomeScreen home;

	public calendarWhy()
	{
		this.setSize(600, 600);
		setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(47, 11, 80, 41);
		add(lblNewLabel);
		
		JLabel lblTue = new JLabel("Tue");
		lblTue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTue.setBounds(122, 11, 80, 41);
		add(lblTue);
		
		JLabel lblWed = new JLabel("Wed");
		lblWed.setHorizontalAlignment(SwingConstants.CENTER);
		lblWed.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWed.setBounds(198, 11, 80, 41);
		add(lblWed);
		
		JLabel lblThu = new JLabel("Thu");
		lblThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblThu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThu.setBounds(270, 11, 80, 41);
		add(lblThu);
		
		JLabel lblFri = new JLabel("Fri ");
		lblFri.setHorizontalAlignment(SwingConstants.CENTER);
		lblFri.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFri.setBounds(346, 11, 80, 41);
		add(lblFri);
		
		JLabel lblSat = new JLabel("Sat");
		lblSat.setHorizontalAlignment(SwingConstants.CENTER);
		lblSat.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSat.setBounds(424, 11, 80, 41);
		add(lblSat);
		
		JLabel lblSun = new JLabel("Sun");
		lblSun.setHorizontalAlignment(SwingConstants.CENTER);
		lblSun.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSun.setBounds(494, 11, 80, 41);
		add(lblSun);
		
		JLabel lblNewLabel_1 = new JLabel("8:00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 60, 49, 29);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("9:00");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 86, 49, 29);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("10:00");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 114, 49, 29);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("11:00");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 144, 49, 29);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("12:00");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 174, 49, 29);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("13:00");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(10, 203, 49, 29);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("14:00");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(10, 234, 49, 29);
		add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("15:00");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_7.setBounds(10, 264, 49, 29);
		add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("16:00");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_8.setBounds(10, 292, 49, 29);
		add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("17:00");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9.setBounds(10, 322, 49, 29);
		add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("18:00");
		lblNewLabel_1_9_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9_1.setBounds(10, 353, 49, 29);
		add(lblNewLabel_1_9_1);
		
		JLabel lblNewLabel_1_9_2 = new JLabel("19:00");
		lblNewLabel_1_9_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9_2.setBounds(10, 382, 49, 29);
		add(lblNewLabel_1_9_2);
		
		JLabel lblNewLabel_1_9_3 = new JLabel("20:00");
		lblNewLabel_1_9_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9_3.setBounds(10, 409, 49, 29);
		add(lblNewLabel_1_9_3);
		
		JLabel lblNewLabel_1_9_4 = new JLabel("21:00");
		lblNewLabel_1_9_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9_4.setBounds(10, 439, 49, 29);
		add(lblNewLabel_1_9_4);
		
		JLabel lblNewLabel_1_9_5 = new JLabel("22:00");
		lblNewLabel_1_9_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_9_5.setBounds(10, 468, 49, 29);
		add(lblNewLabel_1_9_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(57, 60, 70, 22);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(132, 60, 70, 22);
		add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(208, 60, 70, 22);
		add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(280, 60, 70, 22);
		add(textArea_3);
		
		JTextArea textArea_3_1 = new JTextArea();
		textArea_3_1.setBounds(356, 60, 70, 22);
		add(textArea_3_1);
		
		JTextArea textArea_3_2 = new JTextArea();
		textArea_3_2.setBounds(434, 60, 70, 22);
		add(textArea_3_2);
		
		JTextArea textArea_3_3 = new JTextArea();
		textArea_3_3.setBounds(514, 60, 70, 22);
		add(textArea_3_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(57, 90, 70, 22);
		add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(132, 90, 70, 22);
		add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(208, 90, 70, 22);
		add(textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(280, 90, 70, 22);
		add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(356, 90, 70, 22);
		add(textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(434, 90, 70, 22);
		add(textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(514, 90, 70, 22);
		add(textArea_10);
		
		JTextArea textArea_4_1 = new JTextArea();
		textArea_4_1.setBounds(57, 121, 70, 22);
		add(textArea_4_1);
		
		JTextArea textArea_5_1 = new JTextArea();
		textArea_5_1.setBounds(132, 121, 70, 22);
		add(textArea_5_1);
		
		JTextArea textArea_6_1 = new JTextArea();
		textArea_6_1.setBounds(208, 121, 70, 22);
		add(textArea_6_1);
		
		JTextArea textArea_7_1 = new JTextArea();
		textArea_7_1.setBounds(280, 121, 70, 22);
		add(textArea_7_1);
		
		JTextArea textArea_8_1 = new JTextArea();
		textArea_8_1.setBounds(356, 121, 70, 22);
		add(textArea_8_1);
		
		JTextArea textArea_9_1 = new JTextArea();
		textArea_9_1.setBounds(434, 121, 70, 22);
		add(textArea_9_1);
		
		JTextArea textArea_10_1 = new JTextArea();
		textArea_10_1.setBounds(514, 121, 70, 22);
		add(textArea_10_1);
		
		JTextArea textArea_4_2 = new JTextArea();
		textArea_4_2.setBounds(57, 151, 70, 22);
		add(textArea_4_2);
		
		JTextArea textArea_5_2 = new JTextArea();
		textArea_5_2.setBounds(132, 151, 70, 22);
		add(textArea_5_2);
		
		JTextArea textArea_6_2 = new JTextArea();
		textArea_6_2.setBounds(208, 151, 70, 22);
		add(textArea_6_2);
		
		JTextArea textArea_7_2 = new JTextArea();
		textArea_7_2.setBounds(280, 151, 70, 22);
		add(textArea_7_2);
		
		JTextArea textArea_8_2 = new JTextArea();
		textArea_8_2.setBounds(356, 151, 70, 22);
		add(textArea_8_2);
		
		JTextArea textArea_9_2 = new JTextArea();
		textArea_9_2.setBounds(434, 151, 70, 22);
		add(textArea_9_2);
		
		JTextArea textArea_10_2 = new JTextArea();
		textArea_10_2.setBounds(514, 151, 70, 22);
		add(textArea_10_2);
		
		JTextArea textArea_4_3 = new JTextArea();
		textArea_4_3.setBounds(57, 181, 70, 22);
		add(textArea_4_3);
		
		JTextArea textArea_5_3 = new JTextArea();
		textArea_5_3.setBounds(132, 181, 70, 22);
		add(textArea_5_3);
		
		JTextArea textArea_6_3 = new JTextArea();
		textArea_6_3.setBounds(208, 181, 70, 22);
		add(textArea_6_3);
		
		JTextArea textArea_7_3 = new JTextArea();
		textArea_7_3.setBounds(280, 181, 70, 22);
		add(textArea_7_3);
		
		JTextArea textArea_8_3 = new JTextArea();
		textArea_8_3.setBounds(356, 181, 70, 22);
		add(textArea_8_3);
		
		JTextArea textArea_9_3 = new JTextArea();
		textArea_9_3.setBounds(434, 181, 70, 22);
		add(textArea_9_3);
		
		JTextArea textArea_10_3 = new JTextArea();
		textArea_10_3.setBounds(514, 181, 70, 22);
		add(textArea_10_3);
		
		JTextArea textArea_4_4 = new JTextArea();
		textArea_4_4.setBounds(57, 210, 70, 22);
		add(textArea_4_4);
		
		JTextArea textArea_5_4 = new JTextArea();
		textArea_5_4.setBounds(132, 210, 70, 22);
		add(textArea_5_4);
		
		JTextArea textArea_6_4 = new JTextArea();
		textArea_6_4.setBounds(208, 210, 70, 22);
		add(textArea_6_4);
		
		JTextArea textArea_7_4 = new JTextArea();
		textArea_7_4.setBounds(280, 210, 70, 22);
		add(textArea_7_4);
		
		JTextArea textArea_8_4 = new JTextArea();
		textArea_8_4.setBounds(356, 210, 70, 22);
		add(textArea_8_4);
		
		JTextArea textArea_9_4 = new JTextArea();
		textArea_9_4.setBounds(434, 210, 70, 22);
		add(textArea_9_4);
		
		JTextArea textArea_10_4 = new JTextArea();
		textArea_10_4.setBounds(514, 210, 70, 22);
		add(textArea_10_4);
		
		JTextArea textArea_4_5 = new JTextArea();
		textArea_4_5.setBounds(57, 241, 70, 22);
		add(textArea_4_5);
		
		JTextArea textArea_5_5 = new JTextArea();
		textArea_5_5.setBounds(132, 241, 70, 22);
		add(textArea_5_5);
		
		JTextArea textArea_6_5 = new JTextArea();
		textArea_6_5.setBounds(208, 241, 70, 22);
		add(textArea_6_5);
		
		JTextArea textArea_7_5 = new JTextArea();
		textArea_7_5.setBounds(280, 241, 70, 22);
		add(textArea_7_5);
		
		JTextArea textArea_8_5 = new JTextArea();
		textArea_8_5.setBounds(356, 241, 70, 22);
		add(textArea_8_5);
		
		JTextArea textArea_9_5 = new JTextArea();
		textArea_9_5.setBounds(434, 241, 70, 22);
		add(textArea_9_5);
		
		JTextArea textArea_10_5 = new JTextArea();
		textArea_10_5.setBounds(514, 241, 70, 22);
		add(textArea_10_5);
		
		JTextArea textArea_4_6 = new JTextArea();
		textArea_4_6.setBounds(57, 271, 70, 22);
		add(textArea_4_6);
		
		JTextArea textArea_5_6 = new JTextArea();
		textArea_5_6.setBounds(132, 271, 70, 22);
		add(textArea_5_6);
		
		JTextArea textArea_6_6 = new JTextArea();
		textArea_6_6.setBounds(208, 271, 70, 22);
		add(textArea_6_6);
		
		JTextArea textArea_7_6 = new JTextArea();
		textArea_7_6.setBounds(280, 271, 70, 22);
		add(textArea_7_6);
		
		JTextArea textArea_8_6 = new JTextArea();
		textArea_8_6.setBounds(356, 271, 70, 22);
		add(textArea_8_6);
		
		JTextArea textArea_9_6 = new JTextArea();
		textArea_9_6.setBounds(434, 271, 70, 22);
		add(textArea_9_6);
		
		JTextArea textArea_10_6 = new JTextArea();
		textArea_10_6.setBounds(514, 271, 70, 22);
		add(textArea_10_6);
		
		JTextArea textArea_4_7 = new JTextArea();
		textArea_4_7.setBounds(57, 299, 70, 22);
		add(textArea_4_7);
		
		JTextArea textArea_5_7 = new JTextArea();
		textArea_5_7.setBounds(132, 299, 70, 22);
		add(textArea_5_7);
		
		JTextArea textArea_6_7 = new JTextArea();
		textArea_6_7.setBounds(208, 299, 70, 22);
		add(textArea_6_7);
		
		JTextArea textArea_7_7 = new JTextArea();
		textArea_7_7.setBounds(280, 299, 70, 22);
		add(textArea_7_7);
		
		JTextArea textArea_8_7 = new JTextArea();
		textArea_8_7.setBounds(356, 299, 70, 22);
		add(textArea_8_7);
		
		JTextArea textArea_9_7 = new JTextArea();
		textArea_9_7.setBounds(434, 299, 70, 22);
		add(textArea_9_7);
		
		JTextArea textArea_10_7 = new JTextArea();
		textArea_10_7.setBounds(514, 299, 70, 22);
		add(textArea_10_7);
		
		JTextArea textArea_4_8 = new JTextArea();
		textArea_4_8.setBounds(57, 329, 70, 22);
		add(textArea_4_8);
		
		JTextArea textArea_5_8 = new JTextArea();
		textArea_5_8.setBounds(132, 329, 70, 22);
		add(textArea_5_8);
		
		JTextArea textArea_6_8 = new JTextArea();
		textArea_6_8.setBounds(208, 329, 70, 22);
		add(textArea_6_8);
		
		JTextArea textArea_7_8 = new JTextArea();
		textArea_7_8.setBounds(280, 329, 70, 22);
		add(textArea_7_8);
		
		JTextArea textArea_8_8 = new JTextArea();
		textArea_8_8.setBounds(356, 329, 70, 22);
		add(textArea_8_8);
		
		JTextArea textArea_9_8 = new JTextArea();
		textArea_9_8.setBounds(434, 329, 70, 22);
		add(textArea_9_8);
		
		JTextArea textArea_10_8 = new JTextArea();
		textArea_10_8.setBounds(514, 329, 70, 22);
		add(textArea_10_8);
		
		JTextArea textArea_4_9 = new JTextArea();
		textArea_4_9.setBounds(57, 362, 70, 22);
		add(textArea_4_9);
		
		JTextArea textArea_5_9 = new JTextArea();
		textArea_5_9.setBounds(132, 362, 70, 22);
		add(textArea_5_9);
		
		JTextArea textArea_6_9 = new JTextArea();
		textArea_6_9.setBounds(208, 362, 70, 22);
		add(textArea_6_9);
		
		JTextArea textArea_7_9 = new JTextArea();
		textArea_7_9.setBounds(280, 362, 70, 22);
		add(textArea_7_9);
		
		JTextArea textArea_8_9 = new JTextArea();
		textArea_8_9.setBounds(356, 362, 70, 22);
		add(textArea_8_9);
		
		JTextArea textArea_9_9 = new JTextArea();
		textArea_9_9.setBounds(434, 362, 70, 22);
		add(textArea_9_9);
		
		JTextArea textArea_10_9 = new JTextArea();
		textArea_10_9.setBounds(514, 362, 70, 22);
		add(textArea_10_9);
		
		JTextArea textArea_4_10 = new JTextArea();
		textArea_4_10.setBounds(57, 389, 70, 22);
		add(textArea_4_10);
		
		JTextArea textArea_5_10 = new JTextArea();
		textArea_5_10.setBounds(132, 389, 70, 22);
		add(textArea_5_10);
		
		JTextArea textArea_6_10 = new JTextArea();
		textArea_6_10.setBounds(208, 389, 70, 22);
		add(textArea_6_10);
		
		JTextArea textArea_7_10 = new JTextArea();
		textArea_7_10.setBounds(280, 389, 70, 22);
		add(textArea_7_10);
		
		JTextArea textArea_8_10 = new JTextArea();
		textArea_8_10.setBounds(356, 389, 70, 22);
		add(textArea_8_10);
		
		JTextArea textArea_9_10 = new JTextArea();
		textArea_9_10.setBounds(434, 389, 70, 22);
		add(textArea_9_10);
		
		JTextArea textArea_10_10 = new JTextArea();
		textArea_10_10.setBounds(514, 389, 70, 22);
		add(textArea_10_10);
		
		JTextArea textArea_4_11 = new JTextArea();
		textArea_4_11.setBounds(57, 416, 70, 22);
		add(textArea_4_11);
		
		JTextArea textArea_5_11 = new JTextArea();
		textArea_5_11.setBounds(132, 416, 70, 22);
		add(textArea_5_11);
		
		JTextArea textArea_6_11 = new JTextArea();
		textArea_6_11.setBounds(208, 416, 70, 22);
		add(textArea_6_11);
		
		JTextArea textArea_7_11 = new JTextArea();
		textArea_7_11.setBounds(280, 416, 70, 22);
		add(textArea_7_11);
		
		JTextArea textArea_8_11 = new JTextArea();
		textArea_8_11.setBounds(356, 416, 70, 22);
		add(textArea_8_11);
		
		JTextArea textArea_9_11 = new JTextArea();
		textArea_9_11.setBounds(434, 416, 70, 22);
		add(textArea_9_11);
		
		JTextArea textArea_10_11 = new JTextArea();
		textArea_10_11.setBounds(514, 416, 70, 22);
		add(textArea_10_11);
		
		JTextArea textArea_4_12 = new JTextArea();
		textArea_4_12.setBounds(57, 446, 70, 22);
		add(textArea_4_12);
		
		JTextArea textArea_5_12 = new JTextArea();
		textArea_5_12.setBounds(132, 446, 70, 22);
		add(textArea_5_12);
		
		JTextArea textArea_6_12 = new JTextArea();
		textArea_6_12.setBounds(208, 446, 70, 22);
		add(textArea_6_12);
		
		JTextArea textArea_7_12 = new JTextArea();
		textArea_7_12.setBounds(280, 446, 70, 22);
		add(textArea_7_12);
		
		JTextArea textArea_8_12 = new JTextArea();
		textArea_8_12.setBounds(356, 446, 70, 22);
		add(textArea_8_12);
		
		JTextArea textArea_9_12 = new JTextArea();
		textArea_9_12.setBounds(434, 446, 70, 22);
		add(textArea_9_12);
		
		JTextArea textArea_10_12 = new JTextArea();
		textArea_10_12.setBounds(514, 446, 70, 22);
		add(textArea_10_12);
		
		JTextArea textArea_4_13 = new JTextArea();
		textArea_4_13.setBounds(57, 475, 70, 22);
		add(textArea_4_13);
		
		JTextArea textArea_5_13 = new JTextArea();
		textArea_5_13.setBounds(132, 475, 70, 22);
		add(textArea_5_13);
		
		JTextArea textArea_6_13 = new JTextArea();
		textArea_6_13.setBounds(208, 475, 70, 22);
		add(textArea_6_13);
		
		JTextArea textArea_7_13 = new JTextArea();
		textArea_7_13.setBounds(280, 475, 70, 22);
		add(textArea_7_13);
		
		JTextArea textArea_8_13 = new JTextArea();
		textArea_8_13.setBounds(356, 475, 70, 22);
		add(textArea_8_13);
		
		JTextArea textArea_9_13 = new JTextArea();
		textArea_9_13.setBounds(434, 475, 70, 22);
		add(textArea_9_13);
		
		JTextArea textArea_10_13 = new JTextArea();
		textArea_10_13.setBounds(514, 475, 70, 22);
		add(textArea_10_13);
		
		JButton btnNewButton = new JButton("Save ");
		btnNewButton.setBounds(113, 538, 89, 23);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("save");
		add(btnNewButton);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(this);
		btnLoad.setActionCommand("load");
		btnLoad.setBounds(434, 538, 89, 23);
		add(btnLoad);
		
		JButton rtnBut = new JButton("Back");
		rtnBut.addActionListener(this);
		rtnBut.setActionCommand("back");
		rtnBut.setBounds(272, 538, 89, 23);
		add(rtnBut);
		
		for (int i = 0; i < this.getComponentCount(); i++) 
		{
			if (this.getComponent(i) instanceof JTextArea) 
			{
				comps.add((JTextArea) this.getComponent(i));
				JTextArea temp = (JTextArea) this.getComponent(i);
				compString.add(temp.getText());
			}
			
		}
		
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		
		if (e.getActionCommand() == "back") 
		{
			this.setVisible(false);
			home.setVisible(true);
		}
		
		if (e.getActionCommand() == "load") 
		{
			File newFile = new File(userDir + "\\" + "calendarData.txt");
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(newFile);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Scanner sc = new Scanner(fis);
			
			for (int i = 0; i < comps.size(); i++) 
			{
				if (sc.hasNextLine()) 
				{
					comps.get(i).setText(sc.nextLine());
				}
			}
			sc.close();
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (e.getActionCommand() == "save") 
		{
			File newFile = new File(userDir + "\\" + "calendarData.txt");
			try {
				if (newFile.createNewFile()) 
				{
					System.out.println("file has been created");
				}
				else 
				{
					System.out.println("file already exists");
				}
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			FileWriter wr = null;
			FileReader rd = null;
			int count = 0;
			try {
				wr = new FileWriter(newFile);
				System.out.println("new file made");
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			try {
				rd = new FileReader(newFile);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			BufferedReader br = new BufferedReader(rd);
			try {
				while (br.readLine() != null) 
				{
					count++;
					System.out.println(count);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			BufferedWriter bw = new BufferedWriter(wr);
			PrintStream ps = null;
			try {
				ps = new PrintStream(newFile);
			} catch (FileNotFoundException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			if (count == 0) 
			{
				for (int i = 0; i < comps.size(); i++) 
				{
					ps.println(comps.get(i).getText());
				}
				try {
					System.out.println("LINE:" + br.readLine());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else if (count > 0) 
			{
				PrintWriter pw = new PrintWriter(wr, false);
				pw.flush();
				pw.close();
				for (int i = 0; i < comps.size(); i++) 
				{
					try {
						bw.write(comps.get(i).getText());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					bw.newLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			try {
				wr.close();
				System.out.println("closed writer");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				br.readLine();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				rd.close();
				System.out.println("closed reader");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
;		}
	}
	public void getBack(HomeScreen homeScrn) 
	{
		home = homeScrn;
	}
}
