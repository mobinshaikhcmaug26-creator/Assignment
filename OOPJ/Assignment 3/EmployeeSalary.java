import java.util.Scanner;

public class EmployeeSalary {

    int salary;
    int hours;

    public void getInfo(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    public void addWork() {
        if (hours > 6) {
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int hours = sc.nextInt();

        EmployeeSalary e = new EmployeeSalary();

        e.getInfo(salary, hours);
        e.addSal();
        e.addWork();

        System.out.println("Final Salary: " + e.salary);

        sc.close();
    }
}