package Case2ConstructionMethod.Tools;

public class Person {
   // public static String NAME="Chris Tod";
    public static int AGE=26;
    public static double HEIGHT =1.7;
    public static int WEIGHT = 75;
    public boolean MARIGE =false;

    public static void getinf(){
        System.out.println(AGE);
    }
    public static void getinf(boolean isMan ){
        System.out.println(WEIGHT/(Math.pow(HEIGHT,2)));
    }
}
