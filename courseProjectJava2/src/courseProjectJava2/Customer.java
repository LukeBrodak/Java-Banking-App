package courseProjectJava2;

public class Customer{
    private String customerId;
    private String ssn;
    private String lastName;
    private String firstName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public void setCustomerId(String customerId) {
        if (customerId != null && customerId.length() <= 5 && !customerId.isBlank()) {
            this.customerId = customerId;
        } else {
            throw new IllegalArgumentException("Customer ID must be a non-blank string with max length 5");
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setSsn(String ssn) {
        if (ssn != null && ssn.length() == 9 && ssn.matches("\\d+")) {
            this.ssn = ssn;
        } else {
            throw new IllegalArgumentException("SSN must be a 9-digit numeric string");
        }
    }

    public String getSsn() {
        return ssn;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 20 && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name must be a non-blank string with max length 20");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 15 && !firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name must be a non-blank string with max length 15");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setStreet(String street) {
        if (street != null && street.length() <= 20 && !street.isBlank()) {
            this.street = street;
        } else {
            throw new IllegalArgumentException("Street must be a non-blank string with max length 20");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        if (city != null && city.length() <= 20 && !city.isBlank()) {
            this.city = city;
        } else {
            throw new IllegalArgumentException("City must be a non-blank string with max length 20");
        }
    }

    public String getCity() {
        return city;
    }

 
    public void setState(String state) {
        if (state != null && state.length() == 2 && !state.isBlank()) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("State must be a 2-character non-blank string");
        }
    }

    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        if (zip != null && zip.length() == 5 && zip.matches("\\d+")) {
            this.zip = zip;
        } else {
            throw new IllegalArgumentException("Zip must be a 5-digit numeric string");
        }
    }

    public String getZip() {
        return zip;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 10 && phone.matches("\\d+")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must be a 10-digit numeric string");
        }
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
               "\nName: " + firstName + " " + lastName +
               "\nSSN: " + ssn +
               "\nAddress: " + street + ", " + city + ", " + state + " " + zip +
               "\nPhone: " + phone;
    }
}