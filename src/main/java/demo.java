import  org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demo {

	@GetMapping("/demo/")
	public String Index()
	{
		return"demo/index";
	}
}
