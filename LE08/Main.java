public class Main {
    public static void main(String[] args) {
        Crow indianCrow = new IndianCrow();  // Create an IndianCrow instance
        Swan swanAdapter = new CrowAdapter(indianCrow);  // Wrap it in a CrowAdapter

        // Test Swan interface methods
        swanAdapter.eat();  // Delegates to crow.eat()
        swanAdapter.sing(); // Delegates to crow.cry()
        swanAdapter.swim(); // Delegates to crow.fly() as swimming behavior
    }
}
