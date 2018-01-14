package jp.ac.uryukyu.ie.e175713;

public class Boss extends Human{

    public Boss(){
        super.setName("茅場晶彦");
        super.setHp(60);
        super.setAttackPower(10);
        super.setDeath(false);
    }

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

    public void attack2(womanHero o){
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

    public void recovery (){
        int item = 3;
        setHp(getHp() + item);
        System.out.printf("%sは回復アイテムを使った！HPを%d回復！\n",getName(),item);
    }

    @Override
    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() <= 0 ) {
            setDeath(true);
            System.out.printf("%sは倒された。\n", getName());
        }
    }
}

