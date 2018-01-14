package jp.ac.uryukyu.ie.e175713;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();
        Boss boss = new Boss();
        womanHero womanHero = new womanHero();

        System.out.printf("%s&%s vs %s\n", hero.getName(), womanHero.getName(), boss.getName());
        System.out.println(" ");

        int turn = 0;
        while((!womanHero.deathEvent() || !hero.deathEvent()) && !boss.deathEvent()){
            turn++;
            System.out.printf("%dターン目！\n", turn);
            if(!boss.deathEvent()) {
                hero.attack(boss);
            }
            if(!boss.deathEvent()) {
                womanHero.attack(boss);
            }
            int select = (int)(Math.random()*10);
            if(!boss.deathEvent()) {
                if (select < 5 && !hero.deathEvent()) {
                    boss.attack1(hero);
                } else if (select >= 5 && !womanHero.deathEvent()) {
                    boss.attack2(womanHero);
                } else {
                    boss.recovery();
                }
            }

            System.out.printf("%sの残りのHPは%d|",hero.getName(),hero.getHp());
            System.out.printf("%sの残りのHPは%d|",womanHero.getName(),womanHero.getHp());
            System.out.printf("%sの残りのHPは%d|\n",boss.getName(),boss.getHp());
            System.out.println(" ");
        }
        System.out.println("戦闘終了");
    }
}
