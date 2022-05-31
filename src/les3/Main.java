package les3;

public class Main {

    public static void main(String[] args) {

        BalletDancingRobot robot = new BalletDancingRobot();
        printRobot(robot);

        printRobot(new FolkDancingRobot());
        printRobot(new JazzDancingRobot());

    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("====================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("====================\n");

    }
}
