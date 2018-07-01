package com.brillio.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class DollerToRupeesService {

	
		
		public Double convertAmountToRS(String dollar)
		{
		Double amount=0.0;
		amount=Double.parseDouble(dollar);
		amount=amount*65;
		return amount;
		}
	}


