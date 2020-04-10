package com.kleber.zenvia.romannumerals.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class RomanNumeralsService {

    private final Integer[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//    private  Map<Integer, String> ROMAN_NUMBERS;

    public RomanNumeralsService() {
//        ROMAN_NUMBERS = createMap();
    }

    private Map<Integer, String> createMap() {
        Map<Integer, String> map = new LinkedHashMap<>(0);
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500, "D");
        map.put(400,"CD");
        map.put(100, "C");
        map.put(90,"XC");
        map.put(50, "L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5, "V");
        map.put(4,"IV");
        map.put(1,"I");
        return map;
    }

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
