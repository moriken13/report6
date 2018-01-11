package jp.ac.uryukyu.ie.e175713;

public class Human {
    

    private String name = null;
    private int hp = 0;
    private int attackPower = 0;
    //private boolean death;

    public Human(){
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getHp(){ return hp; }
    public void setHp(int hp){ this.hp = hp; }

    public int getAttackPower(){ return attackPower; }
    public void setAttackPower(int attackPower){ this.attackPower = attackPower;}

    //public boolean getDeath(){ return death;}
    //public void setDeath(){ this.death = false;}
}

