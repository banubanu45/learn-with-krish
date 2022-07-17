
public class Director {
	
	public Product createProduct(Builder builder, String param) {
		
		builder.createObject();
		builder.InitializeObject(param);
		
		return builder.returnObject();
		
	}

}
