package behavioralPattern.mediatorPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void mediatorTest() {
        User joUser = new User("jo");
        User kimUser = new User("kim");

        joUser.sendMessage("hello");
        assertEquals(kimUser.sendMessage("bye"), "kimbye");
        assertEquals(joUser.sendMessage("hello"), "johello");

    }

}
