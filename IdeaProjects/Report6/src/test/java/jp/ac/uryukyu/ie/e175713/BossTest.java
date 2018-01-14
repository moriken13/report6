package jp.ac.uryukyu.ie.e175713;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void attack1() {
        Hero hero = new Hero();
        Boss boss = new Boss();
        hero.setHp(10);
        boss.setDeath(true);
        for(int i = 0; i<10; i++){
            boss.attack1(hero);
        }
        assertEquals(hero.getHp(), 10);
    }

    @Test
    void attack2() {
        womanHero womanHero = new womanHero();
        Boss boss = new Boss();
        womanHero.setHp(10);
        boss.setDeath(true);
        for(int i = 0; i<10; i++){
            boss.attack2(womanHero);
        }
        assertEquals(womanHero.getHp(), 10);
    }

}