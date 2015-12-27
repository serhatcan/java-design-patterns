package hw4_3;

/**
 * Created by serhat on 27.12.2015.
 */
public class User {

    // lots of user parameters to help UserState operations perform their job

    private UserState userState;

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }
}
