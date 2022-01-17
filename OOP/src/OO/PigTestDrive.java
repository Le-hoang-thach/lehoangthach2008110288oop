package OO;

public class PigTestDrive {
    public static void main(String[] args) {
        final double Pi = 3.1415926535;
        Pig pig = new Pig();
        pig.size = 7;
        pig.bark();
        Pig pig1 = new Pig();
        pig1.size =100 ;
        pig1.bark();
        System.out.println(Pi);

    }
}
