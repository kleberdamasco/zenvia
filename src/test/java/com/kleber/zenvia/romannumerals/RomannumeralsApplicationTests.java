package com.kleber.zenvia.romannumerals;

import com.kleber.zenvia.romannumerals.service.RomanNumeralsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomannumeralsApplicationTests {

	@Autowired
	RomanNumeralsService romanNumeralsService;


	@Test
	void shouldReturn2014Number(){
		String roman_2014 = "MMXIV";
		Assertions.assertEquals(2014, romanNumeralsService.converterToInteger(roman_2014));
	}

	@Test
	void shouldReturn2014Roman(){
		Integer number_2014 = 2014;
		Assertions.assertEquals("MMXIV", romanNumeralsService.converterToRoman(number_2014));
	}

}
