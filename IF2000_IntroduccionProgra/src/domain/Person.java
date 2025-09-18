package domain;

/**
 *
 * @author Griss
 */
  public class Person {
    //Atributes
    private String name;
    private String latName;
    private String id;
    private String phone;
    private int age;

    public Person(String name, String latName, String id, String phone, int age) {
        this.name = name;
        this.latName = latName;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }
    
    public Person(){
  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person\n"
                + "\n name=" + getName()
                + "\n, latName=" + getLatName()
                + "\n, id=" + getId()
                + "\n, phone=" + getPhone()
                + "\n, age=" + getAge();
    }
    
    
}
