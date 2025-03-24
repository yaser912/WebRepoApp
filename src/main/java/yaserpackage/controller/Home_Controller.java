package yaserpackage.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Home_Controller {
	
	
	@GetMapping("/")
	public String home() {
		return "homepage";
	}
	
	
	@GetMapping("/upload")
		public String uploadPage() {
			return "upload"; 
	}
	
	@GetMapping("/contact")
	public String getContactDetails() {
		return "You can reach me at: 514-582-0786";
	}
}
