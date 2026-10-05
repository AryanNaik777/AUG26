package Inheritance;


public class Member {
    String name;
    int age;
    String phone_no;
    String address;
    double salary;

    Member(String name, int age, String phone_no, String address, double salary){
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }

    void displayMemberDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
