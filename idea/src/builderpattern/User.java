package builderpattern;

public class User {// for make object
    private final String name;
    private final int age;
    private final String email;
    private final String phoneNumber;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class UserBuilder {
        // final for 100 % need other no final can no need
        private final String name;// required
        private int age;// Optional
        private String email;// Optional
        private String phoneNumber;// Optional

        public UserBuilder(String name) {
            this.name = name;// this was final so no need return??
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
