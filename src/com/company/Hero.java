package com.company;

public abstract class Hero implements HavingSuperAbility {

    private int heroesHealth;
    private int heroesDamage;
    private String heroesAttackType;

    public Hero() {
    }

    public Hero(int heroesHealth, int heroesDamage, String heroesAttackType) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public Hero(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public void setHeroesHealth(int heroesHealth) {
        this.heroesHealth = heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public void setHeroesDamage(int heroesDamage) {
        this.heroesDamage = heroesDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }


    public abstract String applySuperAbility(String superAbilityType);
}
