package com.rocky.chen.app;

public class Level2 extends Level1 {
    private final String gender;

    Level2(String id, String name, String gender) {
        super(id, name);

        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public static Builder<? extends Builder> builder() {
        return new Builder<>();
    }

    public static class Builder<S extends Builder<S>> extends Level1.Builder<S> {
        protected String gender;

        Builder() {}

        public S gender(String gender) {
            this.gender = gender;
            return (S) this;
        }

        @Override
        public Level2 build() {
            return new Level2(id, name, gender);
        }
    }
}
