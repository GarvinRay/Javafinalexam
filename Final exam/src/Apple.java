public class Apple extends Fruit{
    private String name;
    private final int hp = 50;

    public Apple() {
        this.name = "Apple";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getHp() {
        return hp;
    }
    @Override
    public void eatFruit(Human human) {
        System.out.println("I ate a " + getName());
        human.setHp(human.getHp() + getHp());
        if(human.getHp() > 100) {
            human.setHp(100);
        }
    }
    @Override
    public void pickFruit(Human human) {
        System.out.println("I picked a " + getName());
        human.addFruit(new Apple());
    }
}
