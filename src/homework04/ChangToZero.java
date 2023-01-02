package homework04;


import java.util.Arrays;

public class ChangToZero {
    public static void main(String[] args) {
        int [] massive = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int)(Math.random()*100)+1;
        }

        for (int i = 0; i < massive.length; i++) {
            if(massive[i]%2 == 0){
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}