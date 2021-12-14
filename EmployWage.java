
public class EmployWage {
    public static final int part_time = 1;
    public static final int full_time = 2;
    public static final int emp_rate = 20;


    public static int attendance() {
        int check = (int) Math.floor(Math.random() * 10) % 3;
        return check;
    }

    public static int calEmpHours( int attend_status) {
        int emp_hrs;
        if (attend_status == full_time)
            emp_hrs = 8;
        else if (attend_status == part_time)
            emp_hrs = 4;
        else
            emp_hrs = 0;
        return emp_hrs;
    }
    public static int calEmpwage( int emp_hours) {
        int wage = emp_hours * emp_rate;
        return wage;
    }
    public static void main(String[] args) {
        int emp_attendance = attendance();
        System.out.println("Employ Attendance Status=" + emp_attendance);

        int emp_hoursPerDay = calEmpHours(emp_attendance);

        int emp_wage = calEmpwage(emp_hoursPerDay);
        System.out.println("Employ wage= " + emp_wage);
    }
}