package com.kleber.zenvia.romannumerals.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PairRomanNumeral {

    private String roman;
    private Integer number;

}
