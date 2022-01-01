package com.rocky.chen.app;

/*
 * Top level class with builder pattern
 */
public class Level0 {
    private final String id;

    Level0(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder<S extends Builder> {
        protected String id;

        Builder() {}

        public S id(String id) {
            this.id = id;
            return (S) this;
        }

        public Level0 build() {
            return new Level0(id);
        }
    }
}
