package structuralPattern.filterPattern.criteria;

import java.util.List;

import structuralPattern.filterPattern.entity.Person;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
