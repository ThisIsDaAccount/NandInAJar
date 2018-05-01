import java.io.*;

public class RUN_SETTINGS 
{
	public final static boolean DEBUG = false;
	private static PrintStream DEBUG_LOG;
	
	public static final PrintStream debug_log() throws FileNotFoundException
	{
		if(DEBUG_LOG==null)
		{
			DEBUG_LOG =  new PrintStream("debug_log.txt");
		}
		
		return DEBUG_LOG;
	}
}
