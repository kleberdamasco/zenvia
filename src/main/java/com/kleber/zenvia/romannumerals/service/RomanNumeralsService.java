package com.kleber.zenvia.romannumerals.service;

import org.springframework.stereotype.Service;

@Service
public class RomanNumeralsService {

    private final Integer[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String converterToRoman(Integer number) {
        int i = 0;
        StringBuilder roman = new StringBuilder();
        while (number > 0 && i < NUMBERS.length) {
            String symbol = ROMAN_NUMBERS[i];
            if (NUMBERS[i] <= number) {
                roman.append(symbol);
                number-=NUMBERS[i];
            } else {
                i++;
            }
        }
        return roman.toString();
    }

    public Integer converterToInteger(String romanNumber) {
        romanNumber = romanNumber.toUpperCase();
        Integer result = 0;

        int i = 0;
        while (romanNumber.length() > 0  && i < ROMAN_NUMBERS.length) {
            String symbol = ROMAN_NUMBERS[i];
            if(romanNumber.startsWith(symbol)) {
                result+=NUMBERS[i];
                romanNumber = romanNumber.substring(symbol.length());
            } else {
                i++;
            }
        }
        return result;
    }
}
