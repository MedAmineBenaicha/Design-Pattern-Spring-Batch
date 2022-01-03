package design.pattern.builder;

import design.pattern.Phone;

public class PhoneBuilder {
    private String os;
    private String camera;
    private double screenSize;
    private String battery;
    private String processor;

    public PhoneBuilder withOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder withCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder withScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder withBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder withProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone build(){
        String os = this.os;
        String camera = this.camera;
        double screenSize = this.screenSize;
        String battery = this.battery;
        String processor = this.processor;

        setToNull(); // Call it to set fields values to null

        return new Phone(os, camera, screenSize, battery, processor);
    }

    private void setToNull(){
        this.os = null;
        this.camera = null;
        this.screenSize = 0;
        this.battery = null;
        this.processor = null;
    }
}
