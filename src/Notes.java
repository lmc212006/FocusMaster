import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Notes extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -5911687413195702139L;
	HomeScreen homeScrn;
	JTextArea textArea = new JTextArea();
	JTextArea ABC = new JTextArea();
	JTextArea a = new JTextArea();
	
	public Notes() 
	{
		setLayout(null);
		this.setSize(600,600);	
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		textArea.setBounds(10, 11, 443, 567);
		add(textArea);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(463, 12, 89, 56);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("clr");
		add(btnNewButton);
		
		JButton btnBack = new JButton("Back ");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.addActionListener(this);
		btnBack.setActionCommand("return");
		btnBack.setBounds(463, 89, 89, 56);
		add(btnBack);
		
		JButton btnSave = new JButton("Save ");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
		btnSave.setBounds(463, 170, 89, 56);
		add(btnSave);
		
		ABC.setLineWrap(true);
		ABC.setWrapStyleWord(true);
		ABC.setBounds(463, 237, 89, 118);
		add(ABC);
		
		JLabel lblNewLabel = new JLabel("Enter Save directory ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(449, 354, 127, 45);
		add(lblNewLabel);
		
		JLabel lblAbove = new JLabel("above");
		lblAbove.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbove.setBounds(449, 367, 127, 45);
		add(lblAbove);
		
		JLabel lblNewLabel_1 = new JLabel("NOTE: Use 2 \\");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(473, 396, 127, 35);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("COMPULSARY");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(463, 410, 89, 35);
		add(lblNewLabel_1_1);
		
		a.setText("NAME HERE");
		a.setBounds(463, 457, 113, 22);
		add(a);
		
		this.setVisible(false);
	}
	
	public void getHmScrn(HomeScreen home) 
	{
		homeScrn = home;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand() == "clr") 
		{
			textArea.setText("");
		}
		if (e.getActionCommand() == "return") 
		{
			this.setVisible(false);
			homeScrn.setVisible(true);
		}
		if(e.getActionCommand() == "save") 
		{
			try 
			{	String name = a.getText();
				File newFile = new File(ABC.getText() + String.format("%s.txt", name));
				newFile.createNewFile();
				FileWriter writer = new FileWriter(newFile);
				writer.write(textArea.getText());
				writer.close();
			} catch (IOException e1) 
			{
				System.out.print("A FATAL ERROR OCCURED");
				e1.printStackTrace();
			}		
		}
	}
}
