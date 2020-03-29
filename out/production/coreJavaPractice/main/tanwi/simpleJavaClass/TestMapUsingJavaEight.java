package tanwi.simpleJavaClass;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TestMapUsingJavaEight {
    public static void main(String args[]){
        Map<Integer,Employee> employeeMap = new TreeMap<Integer,Employee>();
        Employee emp1 = new Employee(13,"Vivan", "Sharma");
        Employee emp2 = new Employee(1,"Xavir", "Alli");
        Employee emp3 = new Employee(533,"Aman", "Gupta");
        Employee emp4 = new Employee(3,"Raghav", "Sodi");
        employeeMap.put(emp1.getEmpId(),emp1);
        employeeMap.put(emp2.getEmpId(),emp2);
        employeeMap.put(emp3.getEmpId(),emp3);
        employeeMap.put(emp4.getEmpId(),emp4);
        employeeMap.forEach((k,v) ->
        {
            System.out.print(k);
            System.out.print("|");
            System.out.print(v.getFirstName());
            System.out.print("|");
            System.out.println(v.getLastname());
        });

    }
}
