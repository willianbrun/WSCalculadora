package br.upf.wscalculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public int addValues(int number1, int number2) {
		return number1 + number2;
	}

}
