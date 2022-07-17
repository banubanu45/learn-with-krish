
public class DBLogger implements ILogger{

	@Override
	public void writeMessage(String Information) {
		System.out.println("Infromation in database"+ Information);
		
	}

}
