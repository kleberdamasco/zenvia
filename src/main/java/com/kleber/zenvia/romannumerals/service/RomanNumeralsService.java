package com.kleber.zenvia.romannumerals.service;

import com.kleber.zenvia.romannumerals.converter.RomanNumberalConverter;
import com.kleber.zenvia.romannumerals.dto.PairRomanNumeral;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralsService {

    private final Integer[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public PairRomanNumeral converterToRoman(Integer number) {
        Integer numberInput = number;
        int i = 0;
        StringBuilder roman = new StringBuilder();
        while (numberInput > 0 && i < NUMBERS.length) {
            String symbol = ROMAN_NUMBERS[i];
            if (NUMBERS[i] <= numberInput) {
                roman.append(symbol);
                numberInput-=NUMBERS[i];
            } else {
                i++;
            }
        }
        return new RomanNumberalConverter().apply(roman.toString(), number);
    }

    public PairRomanNumeral converterToInteger(String romanNumber) {
        String romanNumberInput = romanNumber.toUpperCase();
        Integer number = 0;
        int i = 0;
        while (romanNumberInput.length() > 0  && i < ROMAN_NUMBERS.length) {
            String symbol = ROMAN_NUMBERS[i];
            if(romanNumberInput.startsWith(symbol)) {
                number+=NUMBERS[i];
                romanNumberInput = romanNumberInput.substring(symbol.length());
            } else {
                i++;
            }
        }
        return new RomanNumberalConverter().apply(romanNumber, number);
    }
}
