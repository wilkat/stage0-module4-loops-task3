package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int y = 9;
        int x = 1;

        for(int i = 1; i <=lengthOfLastNumber; i++) {
            sum += y;
            y = y + (x*10*9);
            x *= 10;
        }

        System.out.println(sum);
    }
}
