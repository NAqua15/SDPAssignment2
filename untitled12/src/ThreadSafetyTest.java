public class ThreadSafetyTest {
    public static void demonstrate() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
                instance.demonstrateFunctionality();
            }).start();
        }
    }
}
