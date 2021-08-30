import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ccThread extends Thread implements Runnable
{
	public boolean running = true;
	public void run() 
	{
		while (true) 
		{
			if (running) 
			{
				mainLoop();
			}
			System.out.print("");
		}
	}
	
	void mainLoop() 
	{
        String[] illegalApps = {"chrome.exe", "Code.exe", "msedge.exe"};
        try {
            String line;
            while (running)
            {
            	System.out.println("tets");
	            Process p = Runtime.getRuntime().exec
	        		    (System.getenv("windir") +"\\system32\\"+"tasklist.exe");
	            BufferedReader input =
	        		    new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null && running) {
                    for (int i = 0; i < 3;i++ )
                    {
                        if (line.contains(illegalApps[i]))
                        {
                        	Runtime rt = Runtime.getRuntime();
                        	rt.exec("taskkill /IM " + illegalApps[i]);
                        }
                    }
                }
                input.close();
            }
        } catch (Exception err) {
            err.printStackTrace();
        }  
	}
	
}
