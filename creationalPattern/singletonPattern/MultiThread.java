package creationalPattern.singletonPattern;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("MultiThread singleton");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

}

class Thread1 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        Singleton singleton = Singleton.getInstance("FOO");
        System.out.println(singleton.value);
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        Singleton singleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
    }
}
