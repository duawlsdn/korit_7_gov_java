package generic;

public class HighStudent extends Student{
    private String HighSchool;

    public String getHighSchool() {
        return HighSchool;
    }

    public void setHighSchool(String highSchool) {
        HighSchool = highSchool;
    }

    @Override
    public String toString() {
        return "HighStudent{" +
                "HighSchool='" + HighSchool + '\'' +
                "} " + super.toString();
    }
}
