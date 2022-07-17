package study;

public class Singleton {
	
	private static Singleton dbManager;//=new Singleton();
	
	private Singleton() {
		
	}
	
	
	public static Singleton getdbManager() {
		if(dbManager == null) {
			
			synchronized(Singleton.class) {
				if(dbManager ==null) {
					dbManager = new Singleton();
				}
			}
			
		}
		return dbManager;
	}

}
