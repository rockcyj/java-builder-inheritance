package com.rocky.chen.app;

public class Level3 extends Level2{
    private final String address;

    Level3 (String id, String name, String gender, String address) {
        super(id, name, gender);

        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Level2.Builder<Builder> {
        private String address;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        @Override
        public Level3 build() {
            return new Level3(id, name, gender, address);
        }
    }
}
