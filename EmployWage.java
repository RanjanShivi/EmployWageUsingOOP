
public class EmployWage {
    public static final int part_time = 1;
    public static final int full_time = 2;
    public static final int emp_rate = 20;
    public static final int work_day=20;

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
    public static int calEmpwage( ) {
        int tot_empwage=0, wagePerDay=0;
        for( int i=0; i<work_day; i++) {
            int emp_attendance = attendance();
            System.out.println("Employ Attendance Status=" + emp_attendance);

            int emp_hoursPerDay = calEmpHours(emp_attendance);

            wagePerDay = emp_hoursPerDay * emp_rate;
            System.out.println("Employ wage per day = " + wagePerDay);

            tot_empwage += wagePerDay;
        }
        return tot_empwage;
    }

    public static void main(String[] args) {

        int emp_wage = calEmpwage();
        System.out.println("Total employ wage = " + emp_wage);

    }
}