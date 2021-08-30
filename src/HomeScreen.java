import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class HomeScreen extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -6966114793414201139L;
	calculator calc = new calculator();
	Notes note = new Notes();
	ChromeCloser cc = new ChromeCloser();
	calendarWhy calen = new calendarWhy();
	public HomeScreen() 
	{
		setBackground(SystemColor.activeCaptionBorder);
		this.setSize(600,600);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to FocusMaster!");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(SystemColor.activeCaptionText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblNewLabel.setBounds(0, 11, 600, 231);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculator");
		btnNewButton.setBackground(new Color(102, 255, 102));
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("calculator");
		btnNewButton.setBounds(138, 288, 118, 54);
		add(btnNewButton);
		
		JButton btnNotes = new JButton("Notes");
		btnNotes.setBackground(new Color(102, 255, 102));
		btnNotes.setBounds(138, 381, 118, 54);
		btnNotes.addActionListener(this);
		btnNotes.setActionCommand("notes");
		add(btnNotes);
		
		JButton btnChromecloser = new JButton("ChromeCloser");
		btnChromecloser.setBackground(new Color(102, 255, 102));
		btnChromecloser.setHorizontalAlignment(SwingConstants.LEFT);
		btnChromecloser.setBounds(312, 381, 118, 54);
		btnChromecloser.addActionListener(this);
		btnChromecloser.setActionCommand("cc");
		add(btnChromecloser);
		
		JButton btnNewButton_3 = new JButton("Calendar");
		btnNewButton_3.setBackground(new Color(102, 255, 102));
		btnNewButton_3.setBounds(312, 288, 118, 54);
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setActionCommand("calendar");
		add(btnNewButton_3);
		
		JButton btnNewButton_4_1 = new JButton("Quit");
		btnNewButton_4_1.setBackground(new Color(102, 255, 102));
		btnNewButton_4_1.addActionListener(this);
		btnNewButton_4_1.setActionCommand("quit");
		btnNewButton_4_1.setBounds(230, 462, 118, 54);
		add(btnNewButton_4_1);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand() == "calculator") 
		{
			this.setVisible(false);
			calc.setVisible(true);
			calc.getHomeScrn(this);
		}
		
		if (e.getActionCommand() == "notes") 
		{
			this.setVisible(false);
			note.setVisible(true);
			note.getHmScrn(this);
		}
		
		if (e.getActionCommand() == "cc") 
		{
			this.setVisible(false);
			cc.setVisible(true);
			cc.getHS(this);
		}
		
		if (e.getActionCommand() == "calendar") 
		{
			this.setVisible(false);
			calen.setVisible(true);
			calen.getBack(this);
		}
		
		if(e.getActionCommand() == "quit") 
		{
			System.exit(0);
		}
	}
}
