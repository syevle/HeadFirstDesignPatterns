package myexample.behavioral.visitor_three;

public class EmployeeDisplayVisitor implements EmployeeVisitor
{
    @Override
    public void visit(Employee e) {
        System.out.println(e.getId()+" ---------------- "+e.getName());
    }
}
