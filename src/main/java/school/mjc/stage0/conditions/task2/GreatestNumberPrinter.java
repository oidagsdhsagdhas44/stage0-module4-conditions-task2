package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
//    Implement the program that will find the greatest number from two that are passed as parameters to the method and print
//    the greatest. In case of equality print any of them. Implement program in the code snippet:
    public void printGreatest(int first, int second) {
        if(first == second || first>second){
            System.out.println(first);
        }
        else{
            System.out.println(second);
        }
    }
}
