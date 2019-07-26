package principles.solid_two.liskov;

import java.util.List;

public class Project {

    public void start(List<WorkingEmployee> workingEmployees) {

        for(WorkingEmployee workingEmployee:workingEmployees) {
            workingEmployee.work();
        }
    }
}
