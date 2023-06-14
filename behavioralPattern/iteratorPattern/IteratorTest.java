package behavioralPattern.iteratorPattern;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import behavioralPattern.iteratorPattern.iterator.Iterator;
import behavioralPattern.iteratorPattern.repository.NameRepository;

public class IteratorTest {
    Logger logger = LoggerFactory.getLogger(IteratorTest.class);

    @Test
    public void iteratorTest() {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            logger.info(name);
        }
    }
}
