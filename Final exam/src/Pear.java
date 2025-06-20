public class Pear extends Fruit{
    private String name;
    private final int Hp = 20;
    @Override
    public String getName() {
        return "Pear";
    }
    @Override
    public int getHp() {
        return Hp;
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
        human.addFruit(new Pear());
    }
}
