package GangOfFour.myexample.behavioral.visitor_three;

public class EmployeeSalaryVisitor implements EmployeeVisitor {
    @Override
    public void visit(Employee e) {
        System.out.println(e.getId()+" ---------------- "+e.getSalary());
    }
}
