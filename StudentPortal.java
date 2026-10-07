import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPortal {

    static class Result {
        int serial;
        String code;
        String name;
        int credit;
        String grade;
        double gp;

        Result(int serial, String code, String name, int credit, String grade, double gp) {
            this.serial = serial;
            this.code = code;
            this.name = name;
            this.credit = credit;
            this.grade = grade;
            this.gp = gp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serial = 1;
        int totalCredit = 0;
        double totalPoint = 0;
        List<Result> allResults = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Course " + serial + " ---");
            System.out.print("Enter Your Course Name: ");
            String name = sc.nextLine();
            System.out.print("Enter the Course Code: ");
            String code = sc.nextLine();
            System.out.print("How Many Credits: ");
            int credit = Integer.parseInt(sc.nextLine().trim());

            // Attendance
            System.out.print("Class Taken: ");
            int taken = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Class Attend: ");
            int attend = Integer.parseInt(sc.nextLine().trim());

            if (attend > taken || taken <= 0) {
                System.out.println("Enter Valid Input");
                continue;
            }

            int attendance = (int) (((double) attend / taken) * 100);

            double attMarks;
            if (attendance >= 80) {
                attMarks = 7;
            } else if (attendance >= 70) {
                attMarks = 6.2;
            } else if (attendance >= 60) {
                attMarks = 6;
            } else if (attendance >= 50) {
                attMarks = 5;
            } else if (attendance >= 41) {
                attMarks = 4.2;
            } else {
                attMarks = 0;
            }

            // Marks
            System.out.print("Quiz 1: ");
            double q1 = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Quiz 2: ");
            double q2 = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Quiz 3: ");
            double q3 = Double.parseDouble(sc.nextLine().trim());

            if (q1 > 15 || q2 > 15 || q3 > 15) {
                System.out.println("Enter Valid Quiz Mark");
                continue;
            }

            int quiz = (int) ((q1 + q2 + q3) / 3) + 1;

            System.out.print("Presentation Marks: ");
            double presentation = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Assignment Marks: ");
            double assignment = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Mid Marks: ");
            double mid = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Final Marks: ");
            double finalMarks = Double.parseDouble(sc.nextLine().trim());

            if (presentation > 8 || assignment > 5 || mid > 25 || finalMarks > 40) {
                System.out.println("Enter Valid Marks");
                continue;
            }

            double total = mid + finalMarks + assignment + presentation + quiz + attMarks;

            // Grade
            String grade;
            double gp;
            if (total >= 80) {
                grade = "A+";
                gp = 4.00;
            } else if (total >= 75) {
                grade = "A";
                gp = 3.75;
            } else if (total >= 70) {
                grade = "A-";
                gp = 3.50;
            } else if (total >= 65) {
                grade = "B+";
                gp = 3.25;
            } else if (total >= 60) {
                grade = "B";
                gp = 3.00;
            } else if (total >= 55) {
                grade = "B-";
                gp = 2.75;
            } else if (total >= 50) {
                grade = "C+";
                gp = 2.50;
            } else if (total >= 45) {
                grade = "C";
                gp = 2.25;
            } else if (total >= 40) {
                grade = "D";
                gp = 2.00;
            } else {
                grade = "F";
                gp = 0.00;
            }

            System.out.println("Attendance is " + attendance + " %");
            System.out.println("Quiz Average: " + quiz);
            System.out.println("Total: " + total);

            // Save result
            allResults.add(new Result(serial, code, name, credit, grade, gp));
            totalCredit += credit;
            totalPoint += credit * gp;

            serial++; // serial auto barbe

            System.out.print("Add another course? (y/n): ");
            String again = sc.nextLine().trim();
            if (!again.equals("y")) {
                break;
            }
        }

        // Final table
        System.out.println("\nSL\tCourse Code\tCourse Title\tCredit\tGrade\tGrade Point");
        for (Result r : allResults) {
            System.out.printf("%d\t%s\t\t%s\t\t%.2f\t%s\t%.2f%n",
                    r.serial, r.code, r.name, (double) r.credit, r.grade, r.gp);
        }

        System.out.println("\nTotal Credit: " + totalCredit);
        double gpa = totalCredit == 0 ? 0 : totalPoint / totalCredit;
        System.out.printf("GPA: %.2f%n", gpa);

        sc.close();
    }
}