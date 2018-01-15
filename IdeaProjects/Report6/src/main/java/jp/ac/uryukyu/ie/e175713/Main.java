package jp.ac.uryukyu.ie.e175713;

/**
 * メインクラス
 */
public class Main {

    public static void main(String[] args){
        //インスタンス生成
        Hero hero = new Hero();
        Boss boss = new Boss();
        WomanHero womanHero = new WomanHero();

        //対戦するキャラクターを表示
        System.out.printf("%s&%s vs %s\n", hero.getName(), womanHero.getName(), boss.getName());
        System.out.println(" ");

        /*
         ・ターン数を計算するint型の変数turnを作成
         ・ループ文を作成、条件：(女ヒーローが生存状態またはヒーローが生存状態)かつボスが生存状態のとき
         ・ターン数を表示
         ・ボスが生存状態ならばhero.attack()を実行する
         ・ボスが生存状態ならばwomanHero.attack()を実行する
         ・int型の変数selectに0~9の範囲でランダムに生成した数字を代入する
         ・条件分岐により、ボスが生存状態かつヒーローが生存状態でselectの値が0~4のときにヒーローに攻撃
         ・ボスが生存状態かつ女ヒーローが生存状態かつselectの値が5~9のときに女ヒーローに攻撃
         ・上記以外の場合はboss.recovery()を実行する
         */
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

            //処理後のそれぞれの体力値を表示
            System.out.printf("%sの残りのHPは%d|",hero.getName(),hero.getHp());
            System.out.printf("%sの残りのHPは%d|", womanHero.getName(), womanHero.getHp());
            System.out.printf("%sの残りのHPは%d\n",boss.getName(),boss.getHp());
            System.out.println(" ");
        }

        //勝敗によって、異なる文を出力
        if(hero.deathEvent() && womanHero.deathEvent()){
            System.out.printf("%sの勝利により、我々の希望の光は失われてしまった・・・",boss.getName());
        }else{
            System.out.printf("Congratulations!!デスゲームはクリアされました！");
        }
    }
}