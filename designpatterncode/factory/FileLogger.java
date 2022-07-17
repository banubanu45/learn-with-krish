
public class FileLogger implements ILogger{

	@Override
	public void writeMessage(String Information) {
		System.out.println("Infromation in File"+ Information);
		
	}

}
