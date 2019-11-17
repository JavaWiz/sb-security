package com.javawiz.sbsecuritybasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {
	String getHomePage() {
		return "index";
	}
}
