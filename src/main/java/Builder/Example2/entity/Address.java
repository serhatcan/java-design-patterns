package Builder.Example2.entity;

/**
 * Created by Serhat CAN on 08.11.2015.
 *
 * @Description: This is Builder class
 */
public abstract class Address {

    protected String emailAddress;

    public abstract static class AddressBuilder {
        protected String emailAddress;

        public AddressBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public abstract Address build();

    }

    protected Address(AddressBuilder builder) {
        this.emailAddress = builder.emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
