package domain;

/**
 *
 * @author Griss
 */
public class Client {

    private String id;       // cedula
    private String name;
    private String phone;
    private String address;

    // Constructor
    public Client(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Client [ID=" + id + ", Name=" + name +
                ", Phone=" + phone + ", Address=" + address + "]";
    }

}
