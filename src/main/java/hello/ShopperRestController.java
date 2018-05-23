package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ShopperRestController {

	@Autowired
	private UserRepository userRepository;
	
	//get mapping
	@GetMapping("/shoppers")
	public Iterable<Shopper> getShopper(){
		return userRepository.findAll();
	}
}
