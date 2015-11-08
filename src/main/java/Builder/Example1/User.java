package Builder.Example1;

/**
 * Created by Serhat CAN on 08.11.2015.
 */

/**
 * This class could be created by using immutable objects if the requirements fit.
 * But, the aim is to create the object by hiding complexity and providing guide to the user to
 * set required attributes first, than initialize optional attributes.
 */
public class User {

    private String id; // required
    private String name; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;


    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {

        private String id;
        private String name;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder setAge(int age) {
            if (age < 0 && age > 110) {
                throw new IllegalStateException("Age is out of range");
            }
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
