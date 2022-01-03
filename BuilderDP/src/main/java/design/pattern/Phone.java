package design.pattern;

public class Phone {
    private String os;
    private String camera;
    private double screenSize;
    private String battery;
    private String processor;

    public Phone(String os, String camera, double screenSize, String battery, String processor) {
        this.os = os;
        this.camera = camera;
        this.screenSize = screenSize;
        this.battery = battery;
        this.processor = processor;
    }

    public Phone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", camera='" + camera + '\'' +
                ", screenSize=" + screenSize +
                ", battery='" + battery + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
