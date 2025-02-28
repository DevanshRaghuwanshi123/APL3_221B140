public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton Instance Created!");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.showMessage();

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        lazySingleton2.showMessage();
    }
}
