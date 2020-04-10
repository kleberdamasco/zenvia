package com.kleber.zenvia.romannumerals.resource;

import com.kleber.zenvia.romannumerals.dto.PairRomanNumeral;
import com.kleber.zenvia.romannumerals.service.RomanNumeralsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roman/v1/converter")
public class RomanNumeralsResource {

    private final RomanNumeralsService romanNumeralsService;

    public RomanNumeralsResource(RomanNumeralsService romanNumeralsService) {
        this.romanNumeralsService = romanNumeralsService;
    }

    @GetMapping("/numeral/{roman}")
    public ResponseEntity<PairRomanNumeral> getNumeralFromRoman(@PathVariable String roman) {
        return ResponseEntity.ok(romanNumeralsService.converterToInteger(roman));
    }

    @GetMapping("/roman/{number}")
    public ResponseEntity<PairRomanNumeral> getNumeralFromRoman(@PathVariable Integer number) {
        return ResponseEntity.ok(romanNumeralsService.converterToRoman(number));
    }

}
