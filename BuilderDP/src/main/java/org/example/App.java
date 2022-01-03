package org.example;

import design.pattern.Phone;
import design.pattern.builder.PhoneBuilder;

public class App
{
    public static void main( String[] args )
    {
        PhoneBuilder builder = new PhoneBuilder();

        Phone phone1 = builder.withBattery("Li-on").withCamera("camera-sony").withScreenSize(10).build();

        // should we use a new builder for creating new Instance ???

        Phone phone2 = builder.withOs("Xenos863").withScreenSize(12).build();

        System.out.println(phone1.toString());

        System.out.println(phone2.toString());
    }
}
