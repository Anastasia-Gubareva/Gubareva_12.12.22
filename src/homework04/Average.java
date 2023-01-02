package homework04;

import java.util.Arrays;

public  class Average {

       public static void main(String[] args) {
        int[] massive = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(massive));
        double average =0;
        for (int i =0; i < massive.length; i++){
            average += massive[i];
        }
        System.out.println("Середнє арифметичне " + average/massive.length);
    }
}