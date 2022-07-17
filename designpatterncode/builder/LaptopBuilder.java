
public class LaptopBuilder implements Builder{

	Laptop ob;
	
	@Override
	public void createObject() {
			ob = new Laptop();
	}

	@Override
	public void InitializeObject(String param) {
		String[] params = param.split(",");
		ob.setProcessor(params[0]);
		ob.setMemory(params[1]);
		
	}

	@Override
	public Product returnObject() {	
		return ob;
	}

}
