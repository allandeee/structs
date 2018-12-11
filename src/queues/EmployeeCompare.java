package queues;

import java.util.Comparator;

public class EmployeeCompare implements Comparator<Employee> {

    @Override
    public int compare (Employee a, Employee b) {
        return b.getId() - a.getId();
    }

}
