package jp.ac.uryukyu.ie.e175713;

/**
 * ボスクラス
 * Humanクラスを継承
 */
public class Boss extends Human{

    /**
     * コンストラクタ
     * Bossの名前、体力、攻撃力、生死判定を指定
     * name(名前):ヒースクリフ
     * hp(体力):60
     * AttackPower(攻撃力):10
     * death(生死判定):false(生存状態)
     */
    public Boss(){
        super.setName("ヒースクリフ");
        super.setHp(60);
        super.setAttackPower(10);
        super.setDeath(false);
    }

    /**
     * Heroに攻撃するためのメソッド
     * int型の変数damageにBossの攻撃力未満の数の範囲でランダムに生成された数字を代入
     * 条件分岐でHeroが生存状態かつBossが生存状態のときに攻撃を行うように設計
     * さらに、damageに代入された値が0なら攻撃を行わない
     * 代入された値が0以外のときはo.scar()によりダメージ処理を行う
     * @param o 攻撃対象
     */
    public void attack1(Hero o){
        int damage = (int) (Math.random() * getAttackPower());
        if(!o.deathEvent() && !getDeath()) {
            if(damage == 0) {
                System.out.printf("%sの攻撃！しかし、%sにかわされてしまった！\n", getName(),o.getName());
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), o.getName(), damage);
                o.scar(damage);
            }
        }
    }

    /**
     * WomanHeroに攻撃するためのメソッド
     * attack1と同様の処理を行う
     * @param o 攻撃対象
     */
    public void attack2(WomanHero o){
        int damage = (int) (Math.random() * getAttackPower());
        if(!o.deathEvent() && !getDeath()) {
            if(damage == 0) {
                System.out.printf("%sの攻撃！しかし、%sにかわされてしまった！\n", getName(),o.getName());
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), o.getName(), damage);
                o.scar(damage);
            }
        }
    }

    /**
     * Bossが回復するためのメソッド
     * int型の変数itemに3を代入し、Bossのhpにitemを加算
     */
    public void recovery (){
        int item = 3;
        setHp(getHp() + item);
        System.out.printf("%sは回復アイテムを使った！HPを%d回復！\n",getName(),item);
    }

    /**
     * Bossのダメージ処理を行うメソッド
     * Bossの現在のhpからHeroまたはWomanHeroで計算されたdamageを引く
     * 生死判定を行う
     * @param damage 受けたダメージ
     */
    @Override
    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() <= 0 ) {
            setDeath(true);
            System.out.printf("%sは倒された。\n", getName());
        }
    }
}