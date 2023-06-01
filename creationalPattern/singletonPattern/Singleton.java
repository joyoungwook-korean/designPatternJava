package creationalPattern.singletonPattern;

public class Singleton {
    private static volatile Singleton instasnce;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instasnce;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instasnce == null) {
                instasnce = new Singleton(value);
            }
            return instasnce;
        }
    }

}
