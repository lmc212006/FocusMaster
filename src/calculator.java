import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculator extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -8104150465696183367L;
	private JTextField textField;
	HomeScreen home;
	String calcString = "";

	public calculator() 
	{
		this.setSize(600,600);
		setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("1");
		btnNewButton.setBounds(28, 136, 89, 89);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("2");
		btnNewButton_1.setBounds(139, 136, 89, 89);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setActionCommand("3");
		btnNewButton_2.setBounds(253, 136, 89, 89);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setActionCommand("4");
		btnNewButton_3.setBounds(28, 246, 89, 89);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setActionCommand("5");
		btnNewButton_4.setBounds(139, 246, 89, 89);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.addActionListener(this);
		btnNewButton_5.setActionCommand("6");
		btnNewButton_5.setBounds(253, 246, 89, 89);
		add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.addActionListener(this);
		btnNewButton_6.setActionCommand("7");
		btnNewButton_6.setBounds(28, 357, 89, 89);
		add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_7.addActionListener(this);
		btnNewButton_7.setActionCommand("8");
		btnNewButton_7.setBounds(139, 357, 89, 89);
		add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_8.addActionListener(this);
		btnNewButton_8.setActionCommand("9");
		btnNewButton_8.setBounds(253, 357, 89, 89);
		add(btnNewButton_8);
		
		JButton btnNewButton_2_1 = new JButton("+");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.addActionListener(this);
		btnNewButton_2_1.setActionCommand("+");
		btnNewButton_2_1.setBounds(361, 136, 89, 89);
		add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("-");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2.addActionListener(this);
		btnNewButton_2_2.setActionCommand("-");
		btnNewButton_2_2.setBounds(361, 246, 89, 89);
		add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("×");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_3.addActionListener(this);
		btnNewButton_2_3.setActionCommand("*");
		btnNewButton_2_3.setBounds(361, 357, 89, 89);
		add(btnNewButton_2_3);
		
		JButton btnNewButton_2_5 = new JButton("÷");
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_5.addActionListener(this);
		btnNewButton_2_5.setActionCommand("/");
		btnNewButton_2_5.setBounds(361, 472, 89, 89);
		add(btnNewButton_2_5);
		
		JButton btnNewButton_2_7 = new JButton("0");
		btnNewButton_2_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_7.addActionListener(this);
		btnNewButton_2_7.setActionCommand("0");
		btnNewButton_2_7.setBounds(28, 472, 89, 89);
		add(btnNewButton_2_7);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 33));
		textField.setBounds(28, 23, 422, 89);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Return");
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_9.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_9.addActionListener(this);
		btnNewButton_9.setActionCommand("home");
		btnNewButton_9.setBounds(477, 39, 82, 23);
		add(btnNewButton_9);
		
		JButton btnNewButton_2_1_1 = new JButton("=");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_2_1_1.addActionListener(this);
		btnNewButton_2_1_1.setActionCommand("=");
		btnNewButton_2_1_1.setBounds(253, 471, 89, 89);
		add(btnNewButton_2_1_1);
		
		JButton hello = new JButton("C");
		hello.setFont(new Font("Tahoma", Font.BOLD, 19));
		hello.addActionListener(this);
		hello.setActionCommand("cls");
		hello.setBounds(139, 471, 89, 89);
		add(hello);
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand() == "home") 
		{
			this.setVisible(false);
			home.setVisible(true);
		}
		
		else if (e.getActionCommand() == "cls") 
		{
			calcString = "";
			textField.setText(" ");
		}
		
		else if (e.getActionCommand() == "=") 
		{
			int sum = 0;
			String sumRaw = textField.getText();
			ArrayList<Character> ops = new ArrayList<Character>();
			boolean isOpFound = false;
			String tempNum = "";
			ops.add('+');
			ops.add('-');
			ops.add('*');
			ops.add('/');
			ops.add('^');
			ArrayList<String> nums = new ArrayList<String>();
			ArrayList<Character> opsInSum = new ArrayList<Character>();
			for (int i = 0; i < sumRaw.length(); i++) 
			{
				for(int j = 0; j < ops.size(); j++) 
				{
					if (sumRaw.charAt(i) == ops.get(j)) 
					{
						opsInSum.add(sumRaw.charAt(i));
						isOpFound = true;
					}
				}
				
				if (isOpFound) 
				{
					nums.add(tempNum);
					tempNum = "";
					isOpFound = false;
				}
				
				else 
				{
					tempNum += sumRaw.charAt(i);
				}	
			}
			nums.add(tempNum);
			for (int i = 0; i < opsInSum.size(); i++) 
			{
				if (opsInSum.get(i) == '+') 
				{
					int x = sum;
					if (sum == 0) 
					{
						x = Integer.valueOf(nums.get(i));
					}
					int y = Integer.valueOf(nums.get(i + 1));
					sum = x + y; 
				}
				if (opsInSum.get(i) == '-') 
				{
					int x = sum;
					if (sum == 0) 
					{
						System.out.println(nums.get(i));
						x = Integer.valueOf(nums.get(i));
					}
					if (i + 1 < nums.size()) 
					{
						int y = Integer.valueOf(nums.get(i + 1));
						sum = x - y; 
					}
				}
				
				if (opsInSum.get(i) == '/') 
				{
					int x = sum;
					if (sum == 0) 
					{
						x = Integer.valueOf(nums.get(i));
					}
					if (i + 1 < nums.size()) 
					{
						int y = Integer.valueOf(nums.get(i + 1));
						sum = x/y;
					}
				}
				
				if (opsInSum.get(i) == '*') 
				{
					int x = sum;
					if (sum == 0) 
					{
						x = Integer.valueOf(nums.get(i));
						System.out.println(x);
					}
					if (i + 1 < nums.size()) 
					{
						int y = Integer.valueOf(nums.get(i + 1));
						System.out.println(y);
						System.out.println(Integer.valueOf(x));
						System.out.println(Integer.valueOf(y));
						sum = x * y; 
						System.out.println(sum);
						if (sum < 0) 
						{
							
						}
					}
					
				}
			}
			calcString = String.valueOf(sum);
		}
		else 
		{
			calcString += e.getActionCommand();
		}
		
		textField.setText(calcString);
		
	}
	
	void getHomeScrn(HomeScreen homeScrn) 
	{
		home = homeScrn;
	}
}
