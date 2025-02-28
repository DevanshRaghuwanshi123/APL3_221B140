public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton Instance Created!");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        eagerSingleton1.showMessage();

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        eagerSingleton2.showMessage();
    }
}
