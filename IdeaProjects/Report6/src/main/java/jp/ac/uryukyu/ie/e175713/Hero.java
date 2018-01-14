package jp.ac.uryukyu.ie.e175713;

public class Hero extends Human{

    public Hero(){
        super.setName("キリト");
        super.setHp(40);
        super.setAttackPower(5);
        super.setDeath(false);
    }

    @Override
    public void attack(Human enemy){
        int damage = (int) (Math.random() * getAttackPower());
        int random = (int)(Math.random()*100);
        if(!getDeath()) {
            if(random < 20 && getHp() <= 10) {
                if(damage == 0) {
                    System.out.printf("%sの攻撃！スターバスト・ストリーム！！しかし、かわされてしまった！\n",getName());
                    //enemy.scar(damage);
                }else{
                    System.out.printf("%sの攻撃！スターバスト・ストリーム！！%sに%dのダメージを与えた！\n",getName(),enemy.getName(),damage*2);
                    enemy.scar(damage*2);
                }
            }else{
                if(damage == 0){
                    System.out.printf("%sの攻撃！しかし、かわされてしまった！\n", getName());
                }else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), enemy.getName(), damage);
                    enemy.scar(damage);
                }
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

