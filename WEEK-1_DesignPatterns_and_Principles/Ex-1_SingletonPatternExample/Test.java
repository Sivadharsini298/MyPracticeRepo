public class Test {
    public static void main(String[] args){
        Logger instance1 = Logger.getInstance();

        Logger instance2 = Logger.getInstance();

        System.out.println("Same Instance? "+(instance1 == instance2));
    }
}
