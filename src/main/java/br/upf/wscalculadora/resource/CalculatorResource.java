package br.upf.wscalculadora.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.upf.wscalculadora.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorResource {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@GetMapping("/add")
	public int addValues(
			@RequestParam(required = true, value = "number1") int number1, int number2
			) {
		int valuesSummed = calculatorService.addValues(number1, number2);
		return valuesSummed;
	}

}
