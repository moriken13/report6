package jp.ac.uryukyu.ie.e175713;

public class Human {
    

    private String name = null;
    private int hp = 0;
    private int attackPower = 0;
    private boolean death ;


    //public Human(){}

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getHp(){ return hp; }
    public void setHp(int hp){ this.hp = hp; }

    public int getAttackPower(){ return attackPower; }
    public void setAttackPower(int attackPower){ this.attackPower = attackPower;}

    public boolean getDeath(){ return death;}
    public void setDeath(boolean death){ this.death = death;}

    public boolean deathEvent(){ return getDeath(); }

    public void attack(Human enemy){
        if(!getDeath()) {
            int damage = (int) (Math.random() * getAttackPower());
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), enemy.getName(), damage);
            enemy.scar(damage);
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

