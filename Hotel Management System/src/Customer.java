package hotel.management.system;

public class Customer {
    private String name;
    private String phone;
    private String email;
    private String nationality;
    private String dob;
    private String nationalId;

    // Constructor
    public Customer(String name, String phone, String email, String nationality, String dob, String nationalId) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nationality = nationality;
        this.dob = dob;
        this.nationalId = nationalId;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }
}