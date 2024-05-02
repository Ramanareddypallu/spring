package withoutbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1")
	private int id;
	@Value("dell")
	private String name;
	@Value("black")
	private String color;
	
	@Autowired
	private Charger charger;
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", color=" + color + ", charger=" + charger + "]";
	}
	
	
}
