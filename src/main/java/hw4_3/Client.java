package hw4_3;

/**
 * Created by serhat on 27.12.2015.
 */
public class Client {

    public static void main(String[] args) {

        UserState addCourse = new AddCourse();
        UserState dropCourse = new DropCourse();
        UserState setGrade = new SetGrade();
        UserState showGrades = new ShowGrades();
        UserState approveRegistration = new ApproveRegistration();
        UserState showTranscript = new ShowTranscript();

        User user = new User();
        user.setUserState(addCourse);
        addCourse.doAction(user);

    }
}
