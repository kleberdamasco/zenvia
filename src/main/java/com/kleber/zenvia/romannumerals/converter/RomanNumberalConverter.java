package com.kleber.zenvia.romannumerals.converter;

import com.kleber.zenvia.romannumerals.dto.PairRomanNumeral;

import java.util.function.BiFunction;

public class RomanNumberalConverter implements BiFunction<String, Integer, PairRomanNumeral> {

    @Override
    public PairRomanNumeral apply(String roman, Integer number) {
        return PairRomanNumeral.builder().number(number).roman(roman).build();
    }
}
