
package jp.ac.uryukyu.ie.e175713;

public class Hero extends Human{

    boolean death;

    public Hero(){
        super.setName("キリト");
        super.setHp(30);
        super.setAttackPower(5);
        this.death = false;
        //System.out.print(getName()+"\n"+getHp()+"\n"+getAttackPower());
    }

    public boolean deathEvent(){ return death; }

    public void attack(Boss e){
        int damage = (int)(Math.random() * getAttackPower());
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n",getName(),e.getName(),damage);
        e.scar(damage);
    }

    public void scar(int damage){
        int remainder = getHp() - damage;
        if( remainder < 0 ) {
            death = true;
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }

}

