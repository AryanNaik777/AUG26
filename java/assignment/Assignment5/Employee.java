package Employee_Assignment;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.io.Serializable;

public abstract class Employee implements Serializable, Comparable<Employee> {
    protected String name;
    protected String address;
    protected int age;
    protected String gender;
    protected float basicSalary;

    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    Employee(String name, String address, int age, String gender, float basicSalary) {
        this.name = name;
        this.address = address;
        this.age = this.setAge(age);
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    int setAge(int age) {
        return age >= 18 && age <= 65 ? age : 21;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public float getBasicSalary() {
        return this.basicSalary;
    }
}
