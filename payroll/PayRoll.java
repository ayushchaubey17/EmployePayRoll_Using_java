package payroll;

import employes.Employee;

import java.util.ArrayList;

public class PayRoll {
    private ArrayList<Employee> employesList;

    public PayRoll() {
        employesList = new ArrayList<>();
    }

    public  void addEmploye(Employee employee)
    {
    employesList.add(employee);
    }

    public void removeEmploye(int id) {
        Employee employeeTORemove = null;
        for (Employee emp : employesList){
            if(emp.getId()==id){
                employeeTORemove = emp;
                break;
            }
        }

    if(employeeTORemove != null)employesList.remove(employeeTORemove);

    }


    public    void  printEmploye() {
        for (Employee emp : employesList) {
            System.out.println(emp);
        }
    }



}
