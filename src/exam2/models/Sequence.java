package exam2.models;

public class Sequence {
    private String name;
    private String description;
    private String wayA;
    private String wayB;

    public Sequence(String name, String description, String wayA, String wayB) {
        this.name = name;
        this.description = description;
        this.wayA = wayA;
        this.wayB = wayB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWayA() {
        return wayA;
    }

    public void setWayA(String wayA) {
        this.wayA = wayA;
    }

    public String getWayB() {
        return wayB;
    }

    public void setWayB(String wayB) {
        this.wayB = wayB;
    }

    public Sequence() {
    }
}
