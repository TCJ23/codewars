import org.apache.commons.lang3.Validate;

public class FIXMEGetFullName {

    private String firstName;
    private String lastName;

    public FIXMEGetFullName(String  firstName, String lastName) {
        this.firstName = Validate.notNull(firstName);
        this.lastName = Validate.notNull(lastName);
    }


    public String getFullName() {
        return (firstName + " " + lastName).trim();
    }
}
