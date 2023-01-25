package homework03;

public class printMonthInWordSw {
    public static void main(String args[]) {

        System.out.println(getMonth(15));
    }

    public static String getMonth(int mon) {
        String srt;
        switch (mon) {
            case 1:
                srt = "January";
                break;
            case 2:
                srt = "February";
                break;
            case 3:
                srt = "March";
                break;
            case 4:
                srt = "April";
                break;
            case 5:
                srt = "May";
                break;
            case 6:
                srt = "June";
                break;
            case 7:
                srt = "July";
                break;
            case 8:
                srt = "August";
                break;
            case 9:
                srt = "September";
                break;
            case 10:
                srt = "October";
                break;
            case 11:
                srt = "November";
                break;
            case 12:
                srt = "December";
                break;
            default:
                srt = "Not a valid month";
        }
        return srt;
    }
}
