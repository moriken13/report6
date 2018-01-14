package jp.ac.uryukyu.ie.e175713;

public class womanHero extends Human{

    public womanHero(){
        super.setName("アスナ");
        super.setHp(30);
        super.setAttackPower(5);
        super.setDeath(false);
    }

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

    public void scar(int damage){
        setHp(getHp() - damage);
        if( getHp() <= 0 ) {
            setDeath(true);
            System.out.printf("%sは力尽きてしまった。\n", getName());
        }
    }
}
