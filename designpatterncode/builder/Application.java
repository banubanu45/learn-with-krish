
public class Application {

	public static void main(String[] args) {
		Director objectBuilder = new Director();
		
		Builder builder = new LaptopBuilder();
		Product	ob = objectBuilder.createProduct(builder,"i5,16GB");
		ob.showDetails();

	}

}
