package behavioralPattern.mementoPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void mementoTest() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("memento1");
        originator.setState("memento2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("memento3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("memento4");
        careTaker.add(originator.saveStateToMemento());

        originator.getStateFromMemento(careTaker.get(0));
        assertEquals(originator.getState(), "memento2");
        originator.getStateFromMemento(careTaker.get(1));
        assertEquals(originator.getState(), "memento3");
        originator.getStateFromMemento(careTaker.get(2));
        assertEquals(originator.getState(), "memento4");

    }
}
