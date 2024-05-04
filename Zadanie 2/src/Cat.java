class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String getType() {
        return "Cat";
    }
    @Override
    public void start() {
        System.out.println(name + " started moving.");
    }
    @Override
    public void stop() {
        System.out.println(name + " stopped moving.");
    }
}
