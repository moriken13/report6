package jp.ac.uryukyu.ie.e175713;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();
        Boss boss = new Boss();


        System.out.printf("%s vs. %s\n", hero.getName(), boss.getName());

        int turn = 0;
        while(!hero.deathEvent() && !boss.deathEvent()){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(boss);
            boss.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}
