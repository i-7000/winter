package com.cdutcm3.winter.model.base.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum GenderEnum implements ValuableAndDescribableEnum{

    /**
     *
     */
    FEMALE(0,"女"),
    MALE(1,"男"),
    UNKNOWN(2,"未知"),

    ;

    private Integer value;
    private String desc;


}
