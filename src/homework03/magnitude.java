package homework03;

public class magnitude {
    public static void main(String args[]) {
        double a = 100;
        double b = 100.1;
        if (Math.abs(a) > Math.abs(b)) {
            System.out.println(a + " " + "найбільша величина");
        } else if (Math.abs(a) < Math.abs(b)) {
            System.out.println(b + " " + "найбільша величина");
        } else System.out.println(" немає найбільшої величини, воні рівні");
    }
}