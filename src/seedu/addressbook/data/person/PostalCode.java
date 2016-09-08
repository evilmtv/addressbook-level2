package seedu.addressbook.data.person;

public class PostalCode {
    private String postal_;

    public PostalCode() {
    }

    public String getPostal() {
        return postal_;
    }

    public void setPostal(String postal) {
        postal_ = postal;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof PostalCode && this.postal_.equals(((PostalCode) other).postal_));
    }
}