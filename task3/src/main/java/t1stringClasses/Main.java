package t1stringClasses;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger();

        crazyLogger.addLog("Exterminatus");
        crazyLogger.addLog("Spacemarine");
        crazyLogger.addLog("Holy inquisition");

        System.out.println(crazyLogger.getLog());

        System.out.println(crazyLogger.getLog("Spacemarine"));

    }
}