package jp.ac.uryukyu.ie.e175713;

public class Boss extends Human{

    //boolean death;

    public Boss(){
        super.setName("茅場晶彦");
        super.setHp(60);
        super.setAttackPower(10);
        super.setDeath(false);
        //this.death = false;
    }

    public boolean deathEvent(){ return getDeath(); }

    public void attack1(Hero o){
        if(!o.deathEvent()) {
            if (getDeath() == false) {
                int damage = (int) (Math.random() * getAttackPower());
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), o.getName(), damage);
                o.scar(damage);
            }
        }
    }

    public void attack2(womanHero o){
        if(!o.deathEvent()) {
            if (getDeath() == false) {
                int damage = (int) (Math.random() * getAttackPower());
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), o.getName(), damage);
                o.scar(damage);
            }
        }
    }

    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() < 0 ) {
            setDeath(true);
            System.out.printf("%sは倒された。\n", getName());
        }
    }
}

