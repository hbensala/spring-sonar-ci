package com.example.sonar.sonardemo.example;

import java.security.PrivilegedAction;

public class Example {

    private String string;

    public Example() {
        int sample = 1;
        int add = 2;
        sample =+ add;
        System.out.println("USERNAME=" + getSystemProperty("USERNAME"));
        System.out.println("sample=" + sample);
        infiniteLoop();
    }

    private void infiniteLoop() {
        while (1 == 1) {
            // Do nothing
        }
    }

    private String getSystemProperty(String string) {
        final PrivilegedAction<String> privilegedAction = () -> System.getProperty(string);
        return privilegedAction.run();
    }
}
