package behavioralPattern.observerPattern;

import org.junit.jupiter.api.Test;

import behavioralPattern.observerPattern.entity.Subject;
import behavioralPattern.observerPattern.observer.AAObserver;
import behavioralPattern.observerPattern.observer.BBObserver;
import behavioralPattern.observerPattern.observer.BinaryObserver;

public class ObserverTest {

    @Test
    public void observerTest() {
        Subject subject = new Subject();

        new AAObserver(subject);
        new BBObserver(subject);
        new BinaryObserver(subject);

        subject.setState(1);
    }
}
