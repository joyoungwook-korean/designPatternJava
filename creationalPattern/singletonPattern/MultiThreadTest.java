package creationalPattern.singletonPattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiThreadTest {

    @Test
    @DisplayName("Singleton")
    public void singletonTest() {
        System.out.println("MultiThread singleton");
        Singleton singleton1 = Singleton.getInstance("ton1");
        Singleton singleton2 = Singleton.getInstance("ton2");
        Singleton singleton3 = Singleton.getInstance("ton3");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(singleton1.value);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(singleton2.value);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(singleton3.value);
            }
        });
        assertSame(singleton1, singleton2);
        assertSame(singleton2, singleton3);
        assertEquals(singleton1.value, singleton2.value);
        assertEquals(singleton2.value, singleton3.value);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
