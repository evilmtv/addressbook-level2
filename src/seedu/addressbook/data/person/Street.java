package seedu.addressbook.data.person;

public class Street {
    private String streetName_;

    public Street() {
    }

    public String getStreetName() {
        return streetName_;
    }

    public void setStreetName(String streetName) {
        streetName_ = streetName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof Street && this.streetName_.equals(((Street) other).streetName_));
    }
}