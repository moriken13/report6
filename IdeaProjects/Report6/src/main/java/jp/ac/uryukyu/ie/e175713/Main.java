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
            hero.attack(boss);
            if(!boss.deathEvent()) {
                womanHero.attack(boss);
            }
            int select = (int)(Math.random()*2);
            if( select == 0) {
                boss.attack1(hero);
            }else{
                boss.attack2(womanHero);
            }

            System.out.println(" ");
        }
        System.out.println("戦闘終了");
    }
}
