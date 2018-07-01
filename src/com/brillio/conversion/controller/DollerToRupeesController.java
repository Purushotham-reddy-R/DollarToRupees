package com.brillio.conversion.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brillio.conversion.service.DollerToRupeesService;


@Controller
@RequestMapping("/")
public class DollerToRupeesController {
	@Autowired
	private DollerToRupeesService service;
	
	@RequestMapping(value = "/convert.do")
	public String convertDollarToRupees(HttpServletRequest request) {
		String dollar=request.getParameter("dollarOrRS");
		Double convertedToRS=service.convertAmountToRS(dollar);
		System.out.println("Inside convertDollarToRupees()");
		request.setAttribute("amountRS",convertedToRS);
		
		return "result.jsp";
	

}
}
