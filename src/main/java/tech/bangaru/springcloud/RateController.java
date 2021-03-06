package tech.bangaru.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RefreshScope
public class RateController {
	
	@Value("${rate}")
	private String rate;
	
	@Value("${lanecount}")
	private String lanecount;
	
	@Value("${tollstart}")
	private String tollstart;
	
	@Value("${connstring}")
	private String connstring;	
	
	//@RequestMapping(value = "rate", method = RequestMethod.GET)
	@GetMapping("/rate")
	//@RequestMapping("rates") 
	public String getRate(Model m) {
		m.addAttribute("tollRate",rate);
		m.addAttribute("laneCount",lanecount);
		m.addAttribute("tollStart",tollstart);
		m.addAttribute("connString",connstring);
		// name of the view
		return "rateView";
	}

}
