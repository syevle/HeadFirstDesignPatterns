package myexample.structural.filter_1;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
