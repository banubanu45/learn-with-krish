package study;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton sg= Singleton.getdbManager();
		System.out.println(sg);

		
		Singleton sg1 = Singleton.getdbManager();
		System.out.println(sg1);
	}

}
