import employes.FullTimeEmployee;
import employes.PartTimeEmployee;
import payroll.PayRoll;

public class Main {
    public static void main(String[] args) {
        PayRoll payRollSystem = new PayRoll();

        // full time employe--->
        FullTimeEmployee emp1 = new FullTimeEmployee("Bala Saan",1,1000000.0);
        FullTimeEmployee emp2 = new FullTimeEmployee("Thamarai Saan",2,1000001.0);
        FullTimeEmployee emp3 = new FullTimeEmployee("Nadi Muthu Saan",3,1000002.0);
        FullTimeEmployee emp4 = new FullTimeEmployee("Sudhakar Saan",4,1000003.0);


        // part time employe
        PartTimeEmployee emp5 = new PartTimeEmployee("Ayush chaubey",4921,7,50);
        PartTimeEmployee emp6 = new PartTimeEmployee("Ayush kumar",4922,7,50);
        PartTimeEmployee emp7 = new PartTimeEmployee("Ayush kumar chaubey",4923,7,50);

        // adding the full time employess---->
        payRollSystem.addEmploye(emp1);
        payRollSystem.addEmploye(emp2);
        payRollSystem.addEmploye(emp3);
        payRollSystem.addEmploye(emp4);


        // adding part timers---->
        payRollSystem.addEmploye(emp5);
        payRollSystem.addEmploye(emp6);
        payRollSystem.addEmploye(emp7);

       payRollSystem.printEmploye();

       // now removing one employeee;
        payRollSystem.removeEmploye(4923);

        System.out.println("\n after removing employe ");
        payRollSystem.printEmploye();
    }
}

