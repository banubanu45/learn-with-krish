
public class LoggerFactory {
	
	public static ILogger getLogger() {
		ILogger logger;
		
		String loggerType = "DB";
		
		switch(loggerType) {
		 case("DB"):
			 logger =new DBLogger();
		 	break;
		 case("File"):
			 logger = new FileLogger();
		 	 break;
		 default:
			 logger = new FileLogger();
			 
		}
		
		
		return logger;
		
	}

}
