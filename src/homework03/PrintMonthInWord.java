package homework03;

public class PrintMonthInWord {
    public static void main(String args[]) {

        System.out.println(getMonth(9));
    }
    public static String getMonth(int mon){
        if (mon > 12) {
            return "Not a valid month";
        }
        if (mon == 1) {
            return "January";
        } else if (mon == 2) {
            return "February";
        } else if (mon == 3) {
            return "March";
        } else if (mon == 4) {
            return "April";
        } else if (mon == 5) {
            return "May";
        } else if (mon == 6) {
            return "June";
        } else if (mon == 7) {
            return "July";
        } else if (mon == 8) {
            return "August";
        } else if (mon == 9) {
            return "September";
        } else if (mon == 10) {
            return "October";
        } else if (mon == 11) {
            return "November";
        } else if (mon == 12) {
            return "December";
        }
        return "Not a valid month";

    }
}
