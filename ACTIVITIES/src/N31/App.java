package N31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Employee> empregados = new ArrayList<>(List.of(
                new Employee("Emp A", Employee.Status.ACTIVE),
                new Employee("Emp B", Employee.Status.INACTIVE),
                new Employee("Emp C", Employee.Status.ACTIVE)
        ));
        System.out.println(empregados);
        System.out.println(removeInactives(empregados));
    }
    private static List<Employee> removeInactives (List<Employee> empregados){
        Iterator iter = empregados.iterator();
        while (iter.hasNext()){
            Employee temp = (Employee) iter.next();
            if (temp.getStatus() == Employee.Status.INACTIVE){
                empregados.remove(temp);
            }
        }
        return empregados;
    }
}
