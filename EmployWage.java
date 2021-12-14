public class EmployWage {
    public static final int present=1;

    public static int attendance() {
        int check = (int) Math.floor(Math.random() * 10) % 2;
        return check;
    }

    public static void main(String[] args) {
        int attend_status = attendance();
        System.out.println("Attendance Status = " + attend_status);
        if(attend_status==present)
            System.out.println("Employ Present");
        else
            System.out.println("Employ Absent");

    }
}
