class Main {
    public static void main(String[] args) {
        Human player1 = new Human("Player1", "Man","I will win the game!!!!");
        Human player2 = new Human("Player2", "Man","I will beat you!");
        player1.IPickWepean(new Sward());
        player1.IHitSomeone(player2);//>>>这里回头调整一下，不可以自己打自己。finish.
        player1.IPickFruit(new Apple());
        player1.IPickFruit(new Banana());
        player1.IEatFruit("Apple");
        //>>>有问题，因为这里的Apple是新建的对象，和player1的fruit里面的Apple不是同一个对象，所以会报错。
        //换成这个查询再删除来 利用arraylist的特性
        player2.IPickWepean(new Pistol());
        player2.IHitSomeone(player1);
        player1.IPickWepean(new Pistol());
        player1.IHitSomeone(player2);
    }
}