public class Customer {
    private String username;
    private String firstName;
    private String lastName;
    private String address;
    private String postcode;
    private int phone;
    private String email;

    public Customer(String username, String firstName, String lastName, String address, String postcode, int phone, String email) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
    }
}
