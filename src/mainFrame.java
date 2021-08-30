import javax.swing.JFrame;

public class mainFrame extends JFrame
{
	private static final long serialVersionUID = -1177953479545908261L;

	public mainFrame() 
	{
		this.setSize(600,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		HomeScreen home = new HomeScreen();
		this.add(home);
		this.add(home.calc);
		this.add(home.note);
		this.add(home.cc);
		this.add(home.calen);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new mainFrame();
	}

}
