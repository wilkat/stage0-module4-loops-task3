package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = 0;

        for(int i = 1; i <= second; i++) {
            if(first%i == 0 && second%i == 0){
                if(i > max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}
