package command.party;

public class Light {

    private String location;

    public Light(String loc) {
        this.location = loc;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");

    }
}
