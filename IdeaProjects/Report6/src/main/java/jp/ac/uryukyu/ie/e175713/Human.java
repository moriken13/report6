package jp.ac.uryukyu.ie.e175713;

/**
 * 人間クラス
 */
public class Human {

    /**
     * String name; //名前
     * int hp; //体力値
     * int attackPower; //攻撃力値
     * boolean death; //生死判定、 trueは死亡状態、falseは生存状態
     */
    private String name = null;
    private int hp;
    private int attackPower;
    private boolean death ;

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getHp(){ return hp; }
    public void setHp(int hp){ this.hp = hp; }

    public int getAttackPower(){ return attackPower; }
    public void setAttackPower(int attackPower){ this.attackPower = attackPower;}

    public boolean getDeath(){ return death;}
    public void setDeath(boolean death){ this.death = death;}

    /**
     * getterメソッドと同じ役割を果たす
     */
    public boolean deathEvent(){ return getDeath(); }

    /**
     * 敵を攻撃するためのメソッド
     * int型の変数damageにgetAttackPower()の値の範囲でランダムに生成された値を代入する
     * enemy.scar()によりダメージ処理を行う
     * @param enemy 攻撃対象
     */
    public void attack(Human enemy){
        if(!getDeath()) {
            int damage = (int) (Math.random() * getAttackPower());
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), enemy.getName(), damage);
            enemy.scar(damage);
        }
    }

    /**
     * 攻撃されたときにダメージ処理を行うメソッド
     * 自身の現在の体力値から敵から送られてきたdamageを引いた値をセットする
     * その値により生死判定を行う
     * @param damage 受けたダメージ
     */
    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() <= 0 ) {
            setDeath(true);
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }
}