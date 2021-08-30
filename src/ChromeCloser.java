import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ChromeCloser extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -9050946884329478263L;
	boolean isStart = false;
	HomeScreen hmscrn;
	ccThread thisThread = new ccThread();
	
	public ChromeCloser() 
	{
		setLayout(null);
		setSize(600,600);
		JLabel lblNewLabel = new JLabel("ChromeCloser™");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(102, 11, 344, 90);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Start ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(198, 197, 192, 90);
		btnNewButton.addActionListener(this);
		btnNewButton.setActionCommand("start");
		add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStop.addActionListener(this);
		btnStop.setActionCommand("stop");
		btnStop.setBounds(198, 330, 192, 90);
		add(btnStop);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.addActionListener(this);
		btnBack.setActionCommand("bacc");
		btnBack.setBounds(493, 494, 97, 39);
		add(btnBack);
		
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand() == "start") 
		{
			isStart = true;
			if (!thisThread.isAlive()) 
			{
				thisThread.start();
			}
			else 
			{
				thisThread.running = true;
				System.out.println(thisThread.running);
			}
			Runtime rt = Runtime.getRuntime();
			try {
				rt.exec("taskkill chrome.exe");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (e.getActionCommand() == "stop") 
		{
			isStart = false;
			thisThread.running = false;
		}
		
		if (e.getActionCommand() == "bacc") 
		{
			hmscrn.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public void getHS(HomeScreen home) 
	{
		hmscrn = home;
	}
}
