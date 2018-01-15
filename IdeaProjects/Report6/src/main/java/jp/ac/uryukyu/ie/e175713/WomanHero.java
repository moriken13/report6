package jp.ac.uryukyu.ie.e175713;

/**
 * 女ヒーロークラス
 * Humanクラスを継承
 */
public class WomanHero extends Human{

    /**
     * コンストラクタ
     * WomanHeroの名前、体力、攻撃力、生死判定を指定
     * name(名前):アスナ
     * hp(体力):30
     * AttackPower(攻撃力):5
     * death(生死判定):false(生存状態)
     */
    public WomanHero(){
        super.setName("アスナ");
        super.setHp(30);
        super.setAttackPower(5);
        super.setDeath(false);
    }

    /**
     * Bossに攻撃するためのメソッド
     * int型の変数damageにWomanHeroの攻撃力未満の数の範囲でランダムに生成された数字を代入
     * 条件分岐でHeroが生存状態かつBossが生存状態のときに攻撃を行うように設計
     * さらに、damageに代入された値が0なら攻撃を行わない
     * 代入された値が0以外のときはo.scar()によりダメージ処理を行う
     * @param enemy 攻撃対象
     */
    @Override
    public void attack(Human enemy){
        int damage = (int) (Math.random() * getAttackPower());
        if(!getDeath()) {
            if(damage == 0) {
                System.out.printf("%sの攻撃！しかし、かわされてしまった！\n", getName());
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), enemy.getName(), damage);
                enemy.scar(damage);
            }
        }
    }
}