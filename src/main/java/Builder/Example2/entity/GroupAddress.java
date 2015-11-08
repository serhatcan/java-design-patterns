package Builder.Example2.entity;

import java.util.Map;

/**
 * Created by Serhat CAN on 08.11.2015.
 */
public class GroupAddress extends Address {

    private String name;
    private String purpose;
    private Map<String, String> members; // email key, memberName is value

    public GroupAddress(GroupAddressBuilder builder) {
        super(builder);
        name = builder.name;
        purpose = builder.purpose;
        members = builder.members;
    }

    public static class GroupAddressBuilder extends AddressBuilder {
        private String name;
        private String purpose;
        private Map<String, String> members; // email key, memberName is value

        @Override
        public GroupAddressBuilder emailAddress(String emailAddress) {
            super.emailAddress = emailAddress;
            return this;
        }

        public GroupAddressBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GroupAddressBuilder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public GroupAddressBuilder member(String email, String name) {
            this.members.put(email, name);
            return this;
        }

        public GroupAddressBuilder members(Map<String, String> members) {
            this.members = members;
            return this;
        }

        @Override
        public GroupAddress build() {
            return new GroupAddress(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public Map<String, String> getMembers() {
        return members;
    }
}
