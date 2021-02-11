package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility[] havingSuperAbilities = {new Magic(), new Warrior(),new Medic()};
       // System.out.println(havingSuperAbilities);
        for (int i = 0; i < havingSuperAbilities.length ; i++) {
            herAll(havingSuperAbilities[i]);


        }

    }
    public static void herAll(HavingSuperAbility havingSuperAbility){

        System.out.println(havingSuperAbility.applySuperAbility(" CRITICAL DAMAGE"));
       // System.out.println(havingSuperAbility.applySuperAbility("dd"));
    }

}
