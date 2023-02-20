package school.mjc.stage0.conditions.task2;

public class CoinFlip {
//    Implement the program which will consume 1 number in method arguments and if the number is less than 500
//    print "Eagle" otherwise "Tail" (range of numbers is [1-1000], no checks for that required):
    public void throwCoin(int from1UpTo1000) {
        if(from1UpTo1000 < 500) System.out.println("Eagle");
        else System.out.println("Tail");
    }
}
