import java.util.Scanner;

public class EmployWage {
    public static final int part_time=1;
    public static final int full_time=2;

    public static int attendance() {
        int check = (int) Math.floor(Math.random() * 10) % 3;
        return check;
    }

    public static int calEmpHours( int attend_status) {
        int emp_hrs;
        switch (attend_status) {
            case 1:
                emp_hrs = 4;
                break;
            case 2:
                emp_hrs = 8;
                break;
            default:
                emp_hrs = 0;
        }
        return emp_hrs;
    }
    public static int calEmpwage(int emp_rate, int work_day, int max_hrs) {
        int tot_empwage=0, wagePerDay=0, emp_attendance=0, emp_hoursPerDay=0, tot_emp_hours=0, day=0;
        while(tot_emp_hours < max_hrs && day < work_day) {
            day++;

            emp_attendance = attendance();
            System.out.println("Employ Attendance Status=" + emp_attendance);

            emp_hoursPerDay = calEmpHours(emp_attendance);
            System.out.println("Day:" + day + " Employ hour per day= " + emp_hoursPerDay );

            tot_emp_hours += emp_hoursPerDay;
            wagePerDay = emp_hoursPerDay * emp_rate;
            System.out.println("Employ wage per day = " + wagePerDay);

            tot_empwage += wagePerDay;
        }
        System.out.println("total work day= " + day + " total work hours= " + tot_emp_hours);
        return tot_empwage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of companies");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println("Enter Employ wage rate, Working days in a month and Maximum working hours of your Company-" + i);
            int emp_rate = sc.nextInt();
            int work_day = sc.nextInt();
            int work_hours = sc.nextInt();
            int emp_wage = calEmpwage(emp_rate, work_day, work_hours);
            System.out.println("Total employ wage of Company-" + i + " = " + emp_wage);
            System.out.println(" ");
        }

    }
}