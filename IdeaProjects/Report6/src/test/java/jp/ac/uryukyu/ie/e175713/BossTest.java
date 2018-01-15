package jp.ac.uryukyu.ie.e175713;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {
    /**
     * ボスが死亡状態の時はヒーローに攻撃できないことを確認するためのテスト
     */
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

    /**
     * ボスが死亡状態の時は女ヒーローに攻撃できないことを確認するためのテスト
     */
    @Test
    void attack2() {
        WomanHero WomanHero = new WomanHero();
        Boss boss = new Boss();
        WomanHero.setHp(10);
        boss.setDeath(true);
        for(int i = 0; i<10; i++){
            boss.attack2(WomanHero);
        }
        assertEquals(WomanHero.getHp(), 10);
    }

}