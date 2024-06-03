package producteg;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ProductService {

	Map<String, product> Products = new HashMap<>();
	
	public ProductService() {
		product p = new product("101", "딥러닝", "신구문화사", 2000, "2024.4.29");
		Products.put("101",p);
		p = new product("102", "텐서플로", "ai출판사", 3000, "2024.4.29");
		Products.put("102",p);
		p = new product("103", "빅데이터", "사이언스", 5000, "2024.5.29");
		Products.put("103",p);
	}
	
	public List<product> findAll() {
		return new ArrayList<>(Products.values());
	}
	
	public product find(String id) {
		return Products.get(id);
		
	}
	
}
