
public class Laptop implements Product{

	String _memory = "";
	String _processor = "";
	

	@Override
	public void setMemory(String memory) {
		_memory = memory;
		
	}

	@Override
	public void setProcessor(String processor) {
		_processor = processor;
		
	}
	
	@Override
	public void showDetails() {
		System.out.println("laptop details : "+ _memory + ","+ _processor);
	}

}
