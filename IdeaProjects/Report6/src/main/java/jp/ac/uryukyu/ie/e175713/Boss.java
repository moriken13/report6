package jp.ac.uryukyu.ie.e175713;

public class Boss extends Human{

    boolean death;
    public Boss(){
        super.setName("茅場晶彦");
        super.setHp(50);
        super.setAttackPower(7);
        this.death = false;
    }

    public boolean deathEvent(){ return death; }

    public void attack(Hero o){
        int damage = (int)(Math.random() * getAttackPower());
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n",getName(),o.getName(),damage);
        o.scar(damage);
    }

    public void scar(int damage){
        int remainder = getHp() - damage;
        if( remainder < 0 ) {
            death = true;
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }
}

