public class User {
    private String firstname;
    private String lastname;
    private String city;
    private String country;
    private int age;
    private CountryCode countryCode;
    private String email;
    public String userId;

    public User(String firstname, String lastname, String city, String country, int age, CountryCode countryCode, String email, String userId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.country = country;
        this.age = age;
        this.countryCode = countryCode;
        this.email = email;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", countryCode='" + countryCode + '\'' +
                ", email='" + email + '\'' +
                ", userid='" + userId + '\'' +
                '}';
    }
}
