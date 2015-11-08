package Builder.Example2.entity;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class PeopleAddress extends Address {

    private String firstName;
    private String lastName;
    private String company;
    private String phoneNumber;

    public PeopleAddress(PeopleAddressBuilder builder) {
        super(builder);
        firstName = builder.firstName;
        lastName = builder.lastName;
        company = builder.company;
        phoneNumber = builder.phoneNumber;
    }

    public static class PeopleAddressBuilder extends AddressBuilder {

        private String firstName;
        private String lastName;
        private String company;
        private String phoneNumber;

        @Override
        public PeopleAddressBuilder emailAddress(String emailAddress) {
            super.emailAddress = emailAddress;
            return this;
        }

        public PeopleAddressBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PeopleAddressBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PeopleAddressBuilder company(String company) {
            this.company = company;
            return this;
        }

        public PeopleAddressBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public PeopleAddress build() {
            return new PeopleAddress(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
