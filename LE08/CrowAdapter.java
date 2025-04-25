class CrowAdapter implements Swan {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void eat() {
        crow.eat(); // Delegate to crow's eat method
    }

    @Override
    public void sing() {
        crow.cry(); // Use crow's cry method to simulate singing
    }

    @Override
    public void swim() {
        System.out.println("Swan can't swim like a real swan, but this Crow is flying!");
        crow.fly(); // Crow doesn't swim, so we'll use fly instead
    }
}
