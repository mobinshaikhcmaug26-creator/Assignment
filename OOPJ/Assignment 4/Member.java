import java.util.Scanner;

class Member {

    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class PrimeMembers extends Member {

    int joiningYear;
    double joiningFees;
    boolean isActive;

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public double getJoiningFees() {
        return joiningFees;
    }

    public void setJoiningFees(double joiningFees) {
        this.joiningFees = joiningFees;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Active: " + isActive);
    }
}

public class Member {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrimeMembers member = new PrimeMembers();

        System.out.print("Enter Name: ");
        member.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        member.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        member.setPhoneNumber(sc.nextLine());

        System.out.print("Enter Address: ");
        member.setAddress(sc.nextLine());

        System.out.print("Enter Salary: ");
        member.setSalary(sc.nextDouble());

        System.out.print("Enter Joining Year: ");
        member.setJoiningYear(sc.nextInt());

        System.out.print("Enter Joining Fees: ");
        member.setJoiningFees(sc.nextDouble());

        System.out.print("Is Active: ");
        member.setActive(sc.nextBoolean());

        member.display();
        member.printSalary();

        sc.close();
    }
}