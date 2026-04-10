package college_system;

public abstract class Person {

    protected String name;
    protected long id;
    protected String gender;
    protected String nationality;
    protected String email;
    protected long phone_number;
    protected String address;

    public Person() {
    }

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

}
