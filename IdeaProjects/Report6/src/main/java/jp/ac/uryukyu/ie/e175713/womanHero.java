package jp.ac.uryukyu.ie.e175713;

public class womanHero extends Human{
    //boolean death;

    public womanHero(){
        super.setName("アスナ");
        super.setHp(30);
        super.setAttackPower(5);
        super.setDeath(false);
        //this.death = false;
        //System.out.print(getName()+"\n"+getHp()+"\n"+getAttackPower());
    }

    public boolean deathEvent(){ return getDeath(); }

    public void attack(Boss e){
        if(getDeath() == false) {
            int damage = (int) (Math.random() * getAttackPower());
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), e.getName(), damage);
            e.scar(damage);
        }
    }

    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() < 0 ) {
            setDeath(true);
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }
}
