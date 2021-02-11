package com.company;

public class Medic implements HavingSuperAbility {
    private String toHeal;

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic применил суперспособность " + superAbilityType;
    }
}
