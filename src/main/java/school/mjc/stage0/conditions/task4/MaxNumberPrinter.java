package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        first = first <= second ? second : first;
        first = first <= third ? third : first;
        System.out.println(first);
    }
}
