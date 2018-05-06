package io.github.svaponi.democonsumer;

import org.junit.Test;

public class DemoConsumerTest {

    @Test
    public void test_findClass() throws ClassNotFoundException {
        Class.forName("io.github.svaponi.demo.DemoService");
    }
}
