import java.util.ArrayList;

import static java.lang.System.exit;

public class Human {
    private String name;
    private String sex;
    private String sentence;

    private int hp = 100;
    private Wepean wepean;
    private ArrayList<Fruit> fruit;

    public Wepean getWepean() {
        return wepean;
    }

    public Human(String name, String sex, String sentence) {
        this.name = name;
        this.sex = sex;
        this.sentence = sentence;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSentence() {
        return sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void addFruit(Fruit _fruit) {
        fruit.add(_fruit);
    }
    public void IPickFruit(Fruit _fruit) {
        if (fruit == null) {
            fruit = new ArrayList<>();
        }//我设计是不是有问题？？？这里应该直接addFruit就可以了啊？？？好像没有结合题意。
        _fruit.pickFruit(this);
    }

    public void IEatFruit(String fruitName) {
        if (fruit == null) {
            System.out.println("You don't have this fruit.");
        }else{
            for (Fruit f : fruit) {
                if (f.getName() == fruitName) {
                    f.eatFruit(this);
                    break;
                }
            }
        }
    }

    public void IPickWepean(Wepean _wepean) {
        wepean = _wepean;
        System.out.println("I pick a " + wepean.getName());

    }
    public void IHitSomeone(Human human) {
        if(human == this){
            return;
        }
        if (wepean != null) {
            human.setHp(human.getHp() - wepean.getDamage());
            System.out.println("The current health points of " + human.getName() + " is: " + human.getHp());
            if(human.getHp() <= 0){
                System.out.println(human.getName() + " is OUT!!!");
                exit(0);
            }
        } else {
            human.setHp(human.getHp() - 1);
        }
    }
}
