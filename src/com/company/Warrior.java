package com.company;

public class Warrior extends Hero{
    private String aDamage;


    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior применил суперспособность " + superAbilityType;
    }
}
