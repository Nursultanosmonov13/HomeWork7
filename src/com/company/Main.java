package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hero magic = new Magic();
        String c = magic.applySuperAbility("SUPPER DAMAGE”");
        Hero warrior = new Warrior();
        String b = warrior.applySuperAbility("CRITICAL DAMAGE");
        Medic medic = new Medic();
        String a = medic.applySuperAbility("ПОЛНЫЙ ЖИЗНЬ");
        //System.out.println(a);
        String[] hero = new String[]{c,b,a};
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i]);

        }



    }

}
