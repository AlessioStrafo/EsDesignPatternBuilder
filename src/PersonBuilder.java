public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    public PersonBuilder(){};
    public Person build(){
        return new Person(firstName,lastName,age,address);
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
