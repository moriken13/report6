package jp.ac.uryukyu.ie.e175713;

/**
 * ヒーロークラス
 * Humanクラスを継承
 */
public class Hero extends Human{

    /**
     * コンストラクタ
     * Heroの名前、体力、攻撃力、生死判定を指定
     * name(名前):キリト
     * hp(体力):40
     * AttackPower(攻撃力):5
     * death(生死判定):false(生存状態)
     */
    public Hero(){
        super.setName("キリト");
        super.setHp(40);
        super.setAttackPower(5);
        super.setDeath(false);
    }

    /**
     * Bossを攻撃するためのメソッド
     * int型の変数damageにHeroの攻撃力未満の数の範囲でランダムに生成された数字を代入
     * int型の変数randomに100までの範囲でランダムに生成された数字を代入
     * 条件分岐により、randomに代入された数字が20未満のとき、randomに代入された数字を2倍にし、Heroの攻撃の威力を2倍にする
     * randomに代入された数字が20未満のときでも、damageに代入された数字が0のときは攻撃を行わない
     * randomが20より大きい場合、通常攻撃を行う
     * しかし、damageに代入された数字が0のときは攻撃を行わない
     * いずれの場合もdamageが0以外のときは、enemy.scar()でダメージ処理を行う
     * @param enemy 攻撃対象
     */
    @Override
    public void attack(Human enemy){
        int damage = (int) (Math.random() * getAttackPower());
        int random = (int)(Math.random()*100);
        if(!getDeath()) {
            if(random < 20 && getHp() <= 10) {
                if(damage == 0) {
                    System.out.printf("%sの攻撃！スターバスト・ストリーム！！しかし、かわされてしまった！\n",getName());
                }else{
                    System.out.printf("%sの攻撃！スターバスト・ストリーム！！%sに%dのダメージを与えた！\n",getName(),enemy.getName(),damage*2);
                    enemy.scar(damage*2);
                }
            }else{
                if(damage == 0){
                    System.out.printf("%sの攻撃！しかし、かわされてしまった！\n", getName());
                }else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), enemy.getName(), damage);
                    enemy.scar(damage);
                }
            }
        }
    }
}