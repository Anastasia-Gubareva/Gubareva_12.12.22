package homework03;

public class triangle {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        Integer c = 2;
        String calc = (a == b || b == c || c == a) ? "Трикутник рівнобедрений" : "Трикутник не рівнобедрений";
        System.out.println(calc);
    }
}
