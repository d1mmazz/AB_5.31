package les3;

public class JazzDancingRobot extends DancingRobot {

    public String getDefaultDanceType() {
        return getDanceType2();
    }

    @Override
    public String getDanceType1() {
        return "jazz dancing 1";
    }

    @Override
    public String getDanceType2() {
        return "jazz dance 2";

    }
}
