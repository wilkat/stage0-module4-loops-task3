package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 0;
        int f2 = 1;
        int f3;

        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) {
                f1 = 0;
                System.out.println(f1);
            } else if (i == 1) {
                f2 = 1;
                System.out.println(f2);
            } else {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                System.out.println(f3);
            }
        }
    }
}
