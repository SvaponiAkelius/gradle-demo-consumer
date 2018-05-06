package io.github.svaponi.democonsumer;

import io.github.svaponi.demo.DemoService;
import io.github.svaponi.demo.DemoServiceFactory;

import java.util.Arrays;

public class DemoConsumer {

    public static void main(final String[] args) {

        System.out.printf("Running %s %s \n", DemoConsumer.class.getName(), args.length == 0 ? "[no args]" : Arrays.deepToString(args));

        System.out.printf("Building a DemoService ...\n");

        // System.setProperty("name", "SAM");

        final DemoService service = DemoServiceFactory.getInstance();
        final String name = service.getName();

        System.out.printf("Name from DemoService: %s \n", name);
    }
}
