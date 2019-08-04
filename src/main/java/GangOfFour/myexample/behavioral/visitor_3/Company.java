package GangOfFour.myexample.behavioral.visitor_3;

import java.util.ArrayList;
import java.util.List;

public class Company implements VisitorElement{
    private final List<Employee> employees = new ArrayList<>();

    private void fillEmplyee(){
        employees.add(new Employee(1,100,"Santosh"));
        employees.add(new Employee(2,200,"nitin"));
    }

    public void displayEmpDisplay(){
        EmployeeVisitor empDisplay = new EmployeeDisplayVisitor();
        accept(empDisplay);
    }

    public void displayEmpSal(){
        EmployeeVisitor empSal = new EmployeeSalaryVisitor();
        accept(empSal);
    }

    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        employees.forEach(employee -> employeeVisitor.visit(employee));
    }

    public static void main(String sa[]){

        Company company = new Company();
        company.fillEmplyee();
        company.displayEmpSal();
        company.displayEmpDisplay();
    }
}
