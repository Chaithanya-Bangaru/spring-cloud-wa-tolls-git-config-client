package tech.bangaru.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RateController {
	
	@Value("${rate}")
	private String tollrate;
	
	@Value("${lanecount}")
	private String lanecount;
	
	@Value("${tollstart}")
	private String tollstart;
	
	//@RequestMapping(value = "rate", method = RequestMethod.GET)
	@GetMapping("/rate")
	//@RequestMapping("rates") 
	public String getRate(Model m) {
		m.addAttribute("tollRate",tollrate);
		m.addAttribute("laneCount",lanecount);
		m.addAttribute("tollStart",tollstart);
		// name of the view
		return "rateView";
	}

}
