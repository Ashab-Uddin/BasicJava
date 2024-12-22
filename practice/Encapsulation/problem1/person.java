package practice.Encapsulation.problem1;

public class person {
    private String  Name,country;
    private int age;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
