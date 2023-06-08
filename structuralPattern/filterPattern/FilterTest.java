package structuralPattern.filterPattern;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import structuralPattern.filterPattern.criteria.AndCriteria;
import structuralPattern.filterPattern.criteria.Criteria;
import structuralPattern.filterPattern.criteria.CriteriaFemale;
import structuralPattern.filterPattern.criteria.CriteriaMale;
import structuralPattern.filterPattern.criteria.CriteriaSingle;
import structuralPattern.filterPattern.criteria.OrCriteria;
import structuralPattern.filterPattern.entity.Person;

public class FilterTest {

    @Test
    public void filterTest() {
        List<Person> testMale = new ArrayList<Person>();
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(female, single);

        assertTrue(male.meetCriteria(persons).contains(persons.get(1)));
        assertFalse(male.meetCriteria(persons).contains(persons.get(2)));

        assertTrue(female.meetCriteria(persons).contains(persons.get(2)));
        assertFalse(female.meetCriteria(persons).contains(persons.get(1)));

        assertTrue(singleMale.meetCriteria(persons).contains(persons.get(4)));
        assertTrue(singleOrFemale.meetCriteria(persons).contains(persons.get(3)));

    }

}
