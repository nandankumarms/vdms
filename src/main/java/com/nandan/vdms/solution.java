package com.nandan.vdms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class solution {
	
	@GetMapping("/std")
	public String test() {
		return "done";
	}

}
