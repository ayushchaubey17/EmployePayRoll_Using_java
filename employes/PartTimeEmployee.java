package employes;

import employes.Employee;

public class PartTimeEmployee extends Employee {
    private  int hoursWorked;
    private  int hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, int hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked *30;
    }
}
