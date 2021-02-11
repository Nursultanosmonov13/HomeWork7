package com.company;

public class Magic extends Hero{
    private String aDamage;

    public Magic() {
    }
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic применил суперспособность " + superAbilityType;
    }

}


