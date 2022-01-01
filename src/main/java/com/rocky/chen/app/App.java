package com.rocky.chen.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Level3 instance = Level3
                .builder()
                .id("level3")
                .name("Level3")
                .gender("female")
                .address("Address")
                .build();

        System.out.println(instance.getId());
    }
}
