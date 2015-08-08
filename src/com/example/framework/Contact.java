package com.example.framework;

/**
 * Created by Emma on 8/4/2015.
 */
public class Contact {

    public String firstname;
    public String lastname;
    public String phone;

    public Contact setFirstName(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public Contact setLastName(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (firstname != null ? !firstname.equals(contact.firstname) : contact.firstname != null) return false;
        if (lastname != null ? !lastname.equals(contact.lastname) : contact.lastname != null) return false;
        return !(phone != null ? !phone.equals(contact.phone) : contact.phone != null);
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
