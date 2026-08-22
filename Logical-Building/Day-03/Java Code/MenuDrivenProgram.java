import java.util.Scanner;

public class MenuDrivenProgram {

    static void gradeEvaluation() {

        int maths = 80;
        int science = 85;
        int history = 90;

        int average = (maths + science + history) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else if (average >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }

    static void leapYear() {

        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    static void dayOfWeek() {

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("The day is Monday.");
                break;

            case 2:
                System.out.println("The day is Tuesday.");
                break;

            case 3:
                System.out.println("The day is Wednesday.");
                break;

            case 4:
                System.out.println("The day is Thursday.");
                break;

            case 5:
                System.out.println("The day is Friday.");
                break;

            case 6:
                System.out.println("The day is Saturday.");
                break;

            case 7:
                System.out.println("The day is Sunday.");
                break;

            default:
                System.out.println("Invalid day number");
        }
    }

    static void defaultValues() {

        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0L;
        float e = 0.0f;
        double f = 0.0;
        char g = '\u0000';
        boolean h = false;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Default Values of Variables");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    gradeEvaluation();
                    break;

                case 2:
                    leapYear();
                    break;

                case 3:
                    dayOfWeek();
                    break;

                case 4:
                    defaultValues();
                    break;

                case 5:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}