package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String len = Integer.toString(t);
        int sum = 0;

        for(int i = 0; i <= len.length(); i++) {
            int x = 0;
            x = t % 10;
            sum += x;

            t = t/10;
        }
        System.out.println(sum);
    }
}
