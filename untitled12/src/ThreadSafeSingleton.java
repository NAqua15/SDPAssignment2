public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSafeSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void demonstrateFunctionality() {
        System.out.println("Thread-safe Singleton class in action!");
    }
}

