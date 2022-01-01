package com.rocky.chen.app;

public class Level1 extends Level0 {
    private final String name;

    Level1(String id, String name) {
        super(id);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Builder<? extends Builder> builder() {
        return new Builder<>();
    }

    public static class Builder<S extends Builder<S>> extends Level0.Builder<S> {
        protected String name;

        Builder() {}

        public S name(String name) {
            this.name = name;
            return (S) this;
        }

        @Override
        public Level1 build() {
            return new Level1(id, name);
        }
    }
}
