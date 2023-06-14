package behavioralPattern.iteratorPattern;

import org.junit.jupiter.api.Test;

import behavioralPattern.iteratorPattern.iterator.Iterator;
import behavioralPattern.iteratorPattern.repository.NameRepository;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
