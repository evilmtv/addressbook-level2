package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    protected final String value;
    private boolean isPrivate;

    public Contact(String value, boolean isPrivate, String example, String messageConstraints, String validationRegex)
            throws IllegalValueException {
        this.value = value;
        this.isPrivate = isPrivate;
        if (!value.matches(validationRegex)) {
            throw new IllegalValueException(messageConstraints);
        }
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}