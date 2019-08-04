package GangOfFour.myexample.behavioral.visitor_3;

public class EmployeeDisplayVisitor implements EmployeeVisitor
{
    @Override
    public void visit(Employee e) {
        System.out.println(e.getId()+" ---------------- "+e.getName());
    }
}
